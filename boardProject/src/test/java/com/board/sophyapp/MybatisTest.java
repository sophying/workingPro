package com.board.sophyapp;


import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MybatisTest {

	private static final Logger logger = LoggerFactory.getLogger(MybatisTest.class);

	//@Inject�� ����ϱ� ���ؼ��� maven�̳� gradle�� javax ���̺귯�� �������� �߰��ؾ��Ѵ�
	@Inject
	private SqlSessionFactory sessionFactory;

	@Test
	public void testSessionFactory() {

		logger.info("\n Session Factory : " + sessionFactory);
		System.out.println();

	}

	@Test
	public void testSqlSession() {
		try(SqlSession session = sessionFactory.openSession()) {
			logger.info("\n Sql Session : " + session);
			System.out.println();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}


}
