package cn.ordinary.study.restful.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ordinary
 * @date 2020/1/15
 */
@Configuration
@MapperScan(basePackages = "cn.ordinary.study.restful.mapper")
public class MybatisConfig {
}
