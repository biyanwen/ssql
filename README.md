## Brief introduction

English | [中文](README_ZH.md)

The ssql is a **DSL** language that can simplify the query of a single table. For now, the tool can support many
databases, like Mysql and Oracle, and other whose SQL can compatible with a Mysql or Oracle database.

This tool is very suited to use on URI because it develops based
on [FIQL](http://tools.ietf.org/html/draft-nottingham-atompub-fiql-00) (Feed Item Query Language), so it has a friendly
grammar whit URI, it does not have to transfer meaning for special characters.

For example, you can input a sentence with this `sc_scell_unit--case_id=13539849;pgccr>=300;unit_id<-;<->(1-5)`, if
target database is a Mysql, the tool will
output `select * from sc_scell_unit where case_id = 13539849 and pgccr >= 300 order by unit_id desc limit 1,5 ;`, if
target database is an Oracle, the tool will
output`select * from (select rownum rn,t.* from ( select * from sc_scell_unit where case_id = 13539849 and pgccr >= 300  order by unit_id desc  ) t where rownum <= 5 ) e where e.rn >= 1 ;`

## Maven address

~~~xml

<dependency>
  <groupId>com.github.biyanwen</groupId>
  <artifactId>ssql</artifactId>
  <version>1.0.0</version>
</dependency>
~~~

## Grammar and semantics

ssql is made up of a table name and query conditions, these are connected with `--`, like
this:`tableName--queryCondition`.

### Logical operator

- And：`;`
- Or：`,`

### Compare operator

- Equal to: `=`
- Less than:  `<`
- Less than or equal to: `<=`
- Greater than operator:  `>`
- Greater than or equal to: `>=`
- In : `=in=`
- Like：`=like=`

### Other：

- Positive sequence：`->`
- Reverse order：`<-`
- Limit（is similar with limit function of Mysql）`<->`

### Data type

- String（Need to be wrapped by single quotation marks）：`'xxxx'`
- Number（Various combinations of Arabic numerals）：`123456`
- Fuzzy match string(It needs to use the `=like=` and `*`, the `*` is a placeholder, finally it will be converted
  to`%`):`'*eva'` -> `'%eva'`
- Pagination query(It needs to use the `<->` symbol):`<->(1-5)` (It will be converted to `limit 1,5`)

## For example:

I will take a Mysql database as an example:

~~~
sc_scell_unit--case_id=13539849;pgccr>=300;unit_id<-;<->(1-5)

explain in detail:
1. The `sc_scell_unit` is a table name;
2. In the `case_id=13539849`, the `case_id` means that the field needs to equal 13539849;
3. The `;`is same as the and; 
4. The `pgccr>=300`means the pgccr needs greater than or equal to 300;
5. The `unit_id<-` means that the result is reversed an order by unit_id filed;
6. The <->(1-5) means limie 1,5;

The tool uses this input will output a SQL to a Mysql:

select * from sc_scell_unit
where case_id = 13539849
  and pgccr >= 300
order by unit_id desc limit 1,5;
~~~

## The whole example:

~~~java
//If your target database is an Oracle, you should invoke SsqlHelper.createSqlForOracle() method.
String sqlForMysql=SsqlHelper.createSqlForMysql("sc_scell_unit--case_id=13539849;pgccr>=300;unit_id<-;<->(1-5)");
~~~

If you want to get more examples, you can see the `com.github.byw.SsqlHelperTest` class. 

