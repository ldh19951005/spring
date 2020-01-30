//package cn.ordinary.study.eurekaclients.config;
//
//import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
//import org.springframework.boot.actuate.context.ShutdownEndpoint;
//import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * @author ordinary
// * @date 2020/1/28
// */
//@Configuration
//public class ActuatorSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .requestMatchers(EndpointRequest.to(ShutdownEndpoint.class))
//                .hasRole("ACTUATOR_ADMIN")
//                .requestMatchers(EndpointRequest.toAnyEndpoint())
//                .permitAll()
//                .requestMatchers(PathRequest.toStaticResources().atCommonLocations())
//                .permitAll()
//                .antMatchers("/")
//                .permitAll()
//                .antMatchers("/**")
//                .authenticated()
//                .and()
//                .httpBasic();
//    }
//}