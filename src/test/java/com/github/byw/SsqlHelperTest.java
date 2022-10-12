package com.github.byw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SsqlHelperTest {

	@Test
	void createSqlForMysql() {
		String sqlForMysql = SsqlHelper.createSqlForMysql("sc_scell_unit{case_id=13539849&pgccr>=300&unit_id<-&<->[1,5]}");
		assertEquals("select * from sc_scell_unit where case_id = 13539849 and pgccr >= 300  order by unit_id desc  limit 1,5 ;", sqlForMysql);

		assertThrows(IllegalArgumentException.class, () -> {
			SsqlHelper.createSqlForMysql("sc_scell_unit{case_id=13539849&pgccr>=300&<->[1,5]&unit_id<-}");
		});

		assertThrows(IllegalArgumentException.class, () -> {
			SsqlHelper.createSqlForMysql("sc_scell_unit{case_id=13539849&unit_id<-&pgccr>=300&<->[1,5]}");
		});

		assertThrows(IllegalArgumentException.class, () -> {
			SsqlHelper.createSqlForMysql("sc_scell_unit{unit_id<-&case_id=13539849&pgccr>=300&<->[1,5]}");
		});
	}
}