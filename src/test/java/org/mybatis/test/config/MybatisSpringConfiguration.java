package org.mybatis.test.config;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author zhangdj
 * @date 2020/11/13
 */
@Configuration
@MapperScan("org.mybatis.test.mapper")
public class MybatisSpringConfiguration {

  @Bean
  public SqlSessionFactory sqlSessionFactory() throws Exception {
    SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
    factoryBean.setDataSource(dataSource());
    return factoryBean.getObject();
  }

  @Bean
  public DataSource dataSource() {
    PooledDataSource dataSource = new PooledDataSource();
//    dataSource.setDriver("com.mysql.jdbc.Driver");
    dataSource.setDriver("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/test?serverTimezone=Hongkong");
    dataSource.setUsername("root");
    dataSource.setPassword("root");
    return dataSource;
  }

}
