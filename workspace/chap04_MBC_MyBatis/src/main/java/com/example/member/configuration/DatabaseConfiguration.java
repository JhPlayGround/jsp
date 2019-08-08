package com.example.member.configuration;

import javax.sql.DataSource;
/*
 *  기존 Spring 3.X Version에서 root-context에 설정된 dataSource 역할 
 *  여기서 생성된 object는 dao <-> mapper interface 역할 
 */

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig; // DBCP 관련 클래스 
import com.zaxxer.hikari.HikariDataSource; // DataSource 생성 클래스 

@Configuration // DB관련 설정 클래스 지정 @Bean을 해당 메서드에 적용하여 @Autowired로 빈을 부를 수 있다.
@PropertySource("classpath:application.properties") // 속성 파일 로딩 
public class DatabaseConfiguration {	
	
	// 1. MySQL 연동을 위한 DataSource 생성
	@Bean // 의존관계 클래스 Bean 등록 
	@ConfigurationProperties(prefix="spring.datasource.hikari") 
	// 로딩된 속성 파일(classpath:application.properties)에서 prefix="접두어" 이용 조회 
	public HikariConfig hikariConfig() {
		return new HikariConfig(); // object 반환 
	}
	/* 의존성 추가 : <artifactId>spring-boot-configuration-processor</artifactId>*/
	 
	
	@Bean 
	public DataSource dataSource() throws Exception{
		// HikariConfig Bean DI -> DataSource object 생성 
		DataSource dataSource = new HikariDataSource(hikariConfig()); // Spring DI
		System.out.println(dataSource.toString());
		return dataSource; // object 반환 
	}
	
	// 2. MyBatis 연동을 위한 SqlSessionFactory 생성 
	@Autowired 
	private ApplicationContext applicationContext; // mapper file Resources
	
	@Bean // myBatis 추가
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		// DataSource Bean DI -> myBatis mapper access
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:/mapper/**/sql*.xml"));
		
		return sqlSessionFactoryBean.getObject();
	}
	
	@Bean // myBatis 추가
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory){ 
		return new SqlSessionTemplate(sqlSessionFactory); 
	}
	 
}
