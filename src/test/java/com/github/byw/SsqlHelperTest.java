package com.github.byw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SsqlHelperTest {

	@Test
	void createSqlForMysql() {
		String sqlForMysql = SsqlHelper.createSqlForMysql("sc_scell_unit--case_id=13539849;pgccr>=300;unit_id<-;<->(1-5)");
		assertEquals("select * from sc_scell_unit where case_id = 13539849 and pgccr >= 300  order by unit_id desc  limit 1,5 ;", sqlForMysql);

		String likeSqlForMysql = SsqlHelper.createSqlForMysql("sc_scell_unit--case_id=13539849;unit_name=like='G*';unit_id<-;<->(1-5)");
		assertEquals("select * from sc_scell_unit where case_id = 13539849 and unit_name like 'G%'  order by unit_id desc  limit 1,5 ;", likeSqlForMysql);

		String inSqlForMysql = SsqlHelper.createSqlForMysql("sc_scell_unit--case_id=in=('13539849','13563764','15221101');pgccr>=300;unit_id<-;<->(1-5)");
		assertEquals("select * from sc_scell_unit where case_id in ('13539849','13563764','15221101') and pgccr >= 300  order by unit_id desc  limit 1,5 ;", inSqlForMysql);

		assertThrows(IllegalArgumentException.class, () -> {
			SsqlHelper.createSqlForMysql("sc_scell_unit--case_id=13539849;pgccr>=300;<->(1-5);unit_id<-");
		});

		assertThrows(IllegalArgumentException.class, () -> {
			SsqlHelper.createSqlForMysql("sc_scell_unit--case_id=13539849;unit_id<-;pgccr>=300;<->(1-5)");
		});

		assertThrows(IllegalArgumentException.class, () -> {
			SsqlHelper.createSqlForMysql("sc_scell_unit--unit_id<-;case_id=13539849;pgccr>=300;<->(1-5)");
		});
	}

	@Test
	void createSqlForOracle() {
		String sqlOracle = SsqlHelper.createSqlForOracle("PRODUCT_DIM--DEPARTMENT_NAME='Computers';CATEGORY_ID>=-535;DEPARTMENT_ID<-;<->(2-5)");
		assertEquals("select * from (select rownum rn,t.* from ( select * from PRODUCT_DIM where DEPARTMENT_NAME = 'Computers' and CATEGORY_ID >= -535  order by DEPARTMENT_ID desc  ) t where rownum <= 5 ) e where e.rn >= 2 ;",sqlOracle);

		String sqlOracleSchema = SsqlHelper.createSqlForOracle("AV.PRODUCT_DIM--DEPARTMENT_NAME='Computers';CATEGORY_ID>=-535;DEPARTMENT_ID<-;<->(2-5)");
		assertEquals("select * from (select rownum rn,t.* from ( select * from AV . PRODUCT_DIM where DEPARTMENT_NAME = 'Computers' and CATEGORY_ID >= -535  order by DEPARTMENT_ID desc  ) t where rownum <= 5 ) e where e.rn >= 2 ;",sqlOracleSchema);

		String likeSqlOracle = SsqlHelper.createSqlForOracle("AV.PRODUCT_DIM--DEPARTMENT_NAME=like='Comp*';DEPARTMENT_ID<-;<->(2-5)");
		assertEquals("select * from (select rownum rn,t.* from ( select * from AV . PRODUCT_DIM where DEPARTMENT_NAME like 'Comp%'  order by DEPARTMENT_ID desc  ) t where rownum <= 5 ) e where e.rn >= 2 ;",likeSqlOracle);

		String orSqlOracle = SsqlHelper.createSqlForOracle("AV.PRODUCT_DIM--DEPARTMENT_NAME=like='Comp*',DEPARTMENT_NAME=like='Cam*';DEPARTMENT_ID<-;<->(2-5)");
		assertEquals("select * from (select rownum rn,t.* from ( select * from AV . PRODUCT_DIM where DEPARTMENT_NAME like 'Comp%' or DEPARTMENT_NAME like 'Cam%'  order by DEPARTMENT_ID desc  ) t where rownum <= 5 ) e where e.rn >= 2 ;",orSqlOracle);

		String inSqlForOracle = SsqlHelper.createSqlForOracle("AV.PRODUCT_DIM--DEPARTMENT_NAME=like='Comp*',CATEGORY_ID=in=(-530,-533);DEPARTMENT_ID<-;<->(2-5)");
		assertEquals("select * from (select rownum rn,t.* from ( select * from AV . PRODUCT_DIM where DEPARTMENT_NAME like 'Comp%' or CATEGORY_ID in (-530,-533)  order by DEPARTMENT_ID desc  ) t where rownum <= 5 ) e where e.rn >= 2 ;",inSqlForOracle);
	}
}