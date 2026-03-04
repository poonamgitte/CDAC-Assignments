package org.SpringApp.SpringWithDAO.config;


import javax.sql.DataSource;

import org.SpringApp.web.Entity.Category;
import org.SpringApp.web.dao.CategoryDAO;
import org.SpringApp.web.dao.CategoryDAOImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySources(@PropertySource("classpath:application.properties"))
public class AppConfigurator {
	
	@Bean
	public CategoryDAO categoryDAO() {
		return new CategoryDAOImpl();
	}

	@Bean
	public DataSource dateSource(@Value("${sql.connection.url}" ) String url,
								@Value("${sql.connection.username} ")String username,
								@Value("${sql.connection.password}")String password)
	{
		DataSource dataSource = new DriverManagerDataSource(url,username,password);
		
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public Category objCategory() {
		return new Category();
	}
}
