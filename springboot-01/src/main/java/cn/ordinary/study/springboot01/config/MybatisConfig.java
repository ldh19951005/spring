package cn.ordinary.study.springboot01.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ordinary
 * @date 2020/1/15
 */
@Configuration
@MapperScan(basePackages = "cn.ordinary.study.springboot01.mapper")
public class MybatisConfig {
}
