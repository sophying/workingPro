package com.board.sophyapp;

import static org.junit.Assert.*;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
//@ContextConfiguration(locations = {"classpath:spring/root-context.xml"})
public class testDataSource {


	 @Inject
	 private DataSource dataSource;

	@Test
	public void test() throws Exception {
		//fail("Not yet implemented");
		try(Connection con = dataSource.getConnection()) {
			System.out.println("DataSource 설정 성공!!!!!!!!!!");
			System.out.println(con);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("실패");
			e.printStackTrace();
		}

	}

}
