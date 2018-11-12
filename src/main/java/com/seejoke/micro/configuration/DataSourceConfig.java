package com.seejoke.micro.configuration;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.seejoke.micro.entity.CommonEntity;
import javax.sql.DataSource;
import org.apache.ibatis.io.VFS;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import tk.mybatis.mapper.autoconfigure.SpringBootVFS;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 自定义数据源配置
 *
 * @author yangzhongying
 */
@Configuration
@MapperScan(
  basePackages = "com.seejoke.micro.mapper",
  sqlSessionTemplateRef = "masterSqlSessionTemplate"
)
public class DataSourceConfig {

  private static final Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);

  @Value("${mybatis.config-location:classpath:mybatis/mybatis-config.xml}")
  private String configLocation;

  @Value("${mybatis.type-aliases-package:com.seejoke.network.base.entity}")
  private String typeAliasesPackage;

  @Value("${mybatis.mapper-locations:classpath:mapper/*.xml}")
  private String mapperLocations;

  @Bean(name = "masterDataSource")
  @ConfigurationProperties("spring.datasource.druid")
  public DataSource dataSource() {
    logger.info("init datasource");
    return DruidDataSourceBuilder.create().build();
  }

  @Bean
  public ServletRegistrationBean druidStatViewServlet(
      @Value("${druid.loginUsername}") String loginUsername,
      @Value("${druid.loginPassword}") String loginPassword,
      @Value("${druid.resetEnable}") String resetEnable) {
    logger.info("init ServletRegistrationBean");
    ServletRegistrationBean servletRegistrationBean =
        new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
    servletRegistrationBean.addInitParameter("deny", "192.168.1.73");
    servletRegistrationBean.addInitParameter("loginUsername", loginUsername);
    servletRegistrationBean.addInitParameter("loginPassword", loginPassword);
    servletRegistrationBean.addInitParameter("resetEnable", resetEnable);
    return servletRegistrationBean;
  }

  @Bean
  public FilterRegistrationBean druidStatFilter() {
    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
    filterRegistrationBean.addUrlPatterns("/*");
    filterRegistrationBean.addInitParameter(
        "exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,*.woff2,/woff2,/druid/*");
    filterRegistrationBean.addInitParameter("sessionStatEnable", "false");
    return filterRegistrationBean;
  }

  @Bean(name = "masterSqlSessionFactory")
  @Primary
  public SqlSessionFactory setSqlSessionFactory(
      @Qualifier("masterDataSource") DataSource dataSource) throws Exception {
    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    bean.setDataSource(dataSource);
    VFS.addImplClass(SpringBootVFS.class);
    bean.setTypeAliasesPackage(typeAliasesPackage);
    bean.setConfigLocation(
        new PathMatchingResourcePatternResolver().getResources(configLocation)[0]);
    bean.setMapperLocations(
        new PathMatchingResourcePatternResolver().getResources(mapperLocations));
    bean.setTypeAliasesSuperType(CommonEntity.class);
    return bean.getObject();
  }

  @Bean(name = "masterSqlSessionTemplate")
  @Primary
  public SqlSessionTemplate setSqlSessionTemplate(
      @Qualifier("masterSqlSessionFactory") SqlSessionFactory factory) throws Exception {
    logger.info("init SqlSessionTemplate");
    return new SqlSessionTemplate(factory);
  }

  @Bean(name = "masterTransactionManager")
  public PlatformTransactionManager transactionManager() {
    logger.info("init DataSourceTransactionManager");
    return new DataSourceTransactionManager(dataSource());
  }
}
