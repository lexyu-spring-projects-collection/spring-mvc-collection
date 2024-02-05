package org.lex.practice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author : Lex Yu
 */
@Configuration
@ComponentScan("org.lex.practice.*")
@EnableTransactionManagement
public class TransConfig {
	@Bean
	public DataSource dataSource() {
		return new DriverManagerDataSource(
				"jdbc:mysql://127.0.0.1:3306/spring_data_region?useSSL=false&serverTimezone=Asia/Taipei",
				"root", "P@ssw0rd");
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());

		return jdbcTemplate;
	}

	@Bean
	public TransactionManager transactionManager(@Autowired DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
}
