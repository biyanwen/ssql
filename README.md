## 简介

ssql 是一种 **dsl** 语言，可以方便的生成对**单表的查询 sql 语句**。目前支持生成 **Mysql** 和 **Oracle** 数据库的查询语句如果你有针对其他数据库的需求欢迎提 issue 或者自己实现。

ssql 也可以用于对RESTful接口的实体进行参数过滤。它基于[FIQL](http://tools.ietf.org/html/draft-nottingham-atompub-fiql-00) (Feed Item Query Language)-一种URI友好的语法。FIQL非常适合在URI中使用，没有不安全字符，因此不需要URL编码。

例如你可以输入这样一条语句：`sc_scell_unit--case_id=13539849;pgccr>=300;unit_id<-;<->(1-5)` 目标数据库是 Mysql 会被翻译成 `select * from sc_scell_unit where case_id = 13539849 and pgccr >= 300  order by unit_id desc  limit 1,5 ;` 目标数据库是 Oracle 中会被翻译成 `select * from (select rownum rn,t.* from ( select * from sc_scell_unit where case_id = 13539849 and pgccr >= 300  order by unit_id desc  ) t where rownum <= 5 ) e where e.rn >= 1 ;`。

## 版本
~~~xml
<dependency>
    <groupId>com.github.biyanwen</groupId>
    <artifactId>ssql</artifactId>
    <version>1.0.0</version>
</dependency>
~~~
## 语法和语义

ssql 需要由表名+查询条件组成：`tableName--查询条件`。其中 `--` 是分隔符，之前是表名字，之后是相关查询条件。

### 逻辑运算符

- 逻辑与：`;`
- 逻辑或：`,`

### 比较运算符

- Equal to(等于) : `=`
- Less than(小于) :  `<`
- Less than or equal to(小于等于) : `<=`
- Greater than operator(大于) :  `>`
- Greater than or equal to(大于等于) : `>=`
- In : `=in=`
- like：`=like=`

### 其他：

- 正序：`->`
- 逆序：`<-`
- 范围查询（类似 Mysql 中的 limit）`<->`

### 数值类型

- 字符串（需要由单引号包裹起来）：`'xxxx'`
- 数字类型（阿拉伯数字的各种组合）：`123456`
- 模糊匹配字符串（与 =like= 搭配使用，用 * 来占位）：`'*爱你'` （会被转义为 `'%爱你'`
- 区间数值（与 `<->` 搭配使用）：`<->(1-5)` （会被转义为 `limit 1,5`）

## 例子

以 Mysql 为例：

~~~sql
sc_scell_unit--case_id=13539849;pgccr>=300;unit_id<-;<->(1-5)
详解： `sc_scell_unit`  是表名; `case_id=13539849` 是指 case_id 需要等于 13539849;  `;` 是 and 的意思; `pgccr>=300` 表示 pgccr 要大于等于 300;`unit_id<-` 表示按照 unit_id 字段逆序返回结果; <->(1-5) 表示 limie 1,5;
等价于：select * from sc_scell_unit where case_id = 13539849 and pgccr >= 300  order by unit_id desc  limit 1,5 ;


~~~
## 如何使用
~~~java
//如果是 Oracle 请调用 SsqlHelper.createSqlForOracle()
String sqlForMysql = SsqlHelper.createSqlForMysql("sc_scell_unit--case_id=13539849;pgccr>=300;unit_id<-;<->(1-5)");
~~~
更多使用样例请参考 com.github.byw.SsqlHelperTest

