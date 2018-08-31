//package com.anycall.member.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * 数据源配置类
// *
// * @author dengpengfei
// *
// */
//@Configuration
//@ConfigurationProperties(prefix = "spring.datasource")
//public class DruidDataSourceConfig {
//
//    private String username;
//    private String password;
//    private String url;
//    private String driverClassName;
//    private int initialSize;
//    private int minIdle;
//    private int maxActive;
//    private int maxWait;
//    private int timeBetweenEvictionRunsMillis;
//    private int minEvictableIdleTimeMillis;
//    private String validationQuery;
//    private boolean testWhileIdle;
//    private boolean testOnBorrow;
//    private boolean testOnReturn;
//    private boolean poolPreparedStatements;
//    private String filters;
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getDriverClassName() {
//        return driverClassName;
//    }
//
//    public void setDriverClassName(String driverClassName) {
//        this.driverClassName = driverClassName;
//    }
//
//    public int getInitialSize() {
//        return initialSize;
//    }
//
//    public void setInitialSize(int initialSize) {
//        this.initialSize = initialSize;
//    }
//
//    public int getMinIdle() {
//        return minIdle;
//    }
//
//    public void setMinIdle(int minIdle) {
//        this.minIdle = minIdle;
//    }
//
//    public int getMaxActive() {
//        return maxActive;
//    }
//
//    public void setMaxActive(int maxActive) {
//        this.maxActive = maxActive;
//    }
//
//    public int getMaxWait() {
//        return maxWait;
//    }
//
//    public void setMaxWait(int maxWait) {
//        this.maxWait = maxWait;
//    }
//
//    public int getTimeBetweenEvictionRunsMillis() {
//        return timeBetweenEvictionRunsMillis;
//    }
//
//    public void setTimeBetweenEvictionRunsMillis(int timeBetweenEvictionRunsMillis) {
//        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
//    }
//
//    public int getMinEvictableIdleTimeMillis() {
//        return minEvictableIdleTimeMillis;
//    }
//
//    public void setMinEvictableIdleTimeMillis(int minEvictableIdleTimeMillis) {
//        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
//    }
//
//    public String getValidationQuery() {
//        return validationQuery;
//    }
//
//    public void setValidationQuery(String validationQuery) {
//        this.validationQuery = validationQuery;
//    }
//
//    public boolean isTestWhileIdle() {
//        return testWhileIdle;
//    }
//
//    public void setTestWhileIdle(boolean testWhileIdle) {
//        this.testWhileIdle = testWhileIdle;
//    }
//
//    public boolean isTestOnBorrow() {
//        return testOnBorrow;
//    }
//
//    public void setTestOnBorrow(boolean testOnBorrow) {
//        this.testOnBorrow = testOnBorrow;
//    }
//
//    public boolean isTestOnReturn() {
//        return testOnReturn;
//    }
//
//    public void setTestOnReturn(boolean testOnReturn) {
//        this.testOnReturn = testOnReturn;
//    }
//
//    public boolean isPoolPreparedStatements() {
//        return poolPreparedStatements;
//    }
//
//    public void setPoolPreparedStatements(boolean poolPreparedStatements) {
//        this.poolPreparedStatements = poolPreparedStatements;
//    }
//
//    public String getFilters() {
//        return filters;
//    }
//
//    public void setFilters(String filters) {
//        this.filters = filters;
//    }
//
//    /**
//     * 获取druid数据源
//     * @return  DruidDataSource
//     */
//    @Bean
//    public DruidDataSource dataSource() {
//
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUsername(this.username);
//        dataSource.setPassword(this.password);
//        dataSource.setUrl(this.url);
//        dataSource.setDriverClassName(this.driverClassName);
//        dataSource.setInitialSize(this.initialSize);
//        dataSource.setMinIdle(this.minIdle);
//        dataSource.setMaxActive(this.maxActive);
//        dataSource.setMaxWait(this.maxWait);
//        dataSource.setTimeBetweenEvictionRunsMillis(this.timeBetweenEvictionRunsMillis);
//        dataSource.setMinEvictableIdleTimeMillis(this.minEvictableIdleTimeMillis);
//        dataSource.setValidationQuery(this.validationQuery);
//        dataSource.setTestWhileIdle(this.testWhileIdle);
//        dataSource.setTestOnBorrow(this.testOnBorrow);
//        dataSource.setTestOnReturn(this.testOnReturn);
//        dataSource.setPoolPreparedStatements(this.poolPreparedStatements);
//        return dataSource;
//    }
//}
