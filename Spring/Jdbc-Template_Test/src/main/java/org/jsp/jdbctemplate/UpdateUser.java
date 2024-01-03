package org.jsp.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateUser {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		int r=template.update("update user set name='jhansi',desg='sqldeveloper' where id=1");
		System.out.println(" Employee updated");
	}
}
