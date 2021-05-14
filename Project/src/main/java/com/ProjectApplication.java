package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)


@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
    
//	@Bean
//	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
//		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//		sessionFactory.setDataSource((javax.sql.DataSource) dataSource);
//		
//		Resource[] res = (Resource[]) new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*Mapper.xml");
//		sessionFactory.setMapperLocations((org.springframework.core.io.Resource[]) res);
//		
//		return sessionFactory.getObject();
//	}

}
