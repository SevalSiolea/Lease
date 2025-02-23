package com.siolea.lease.web.admin.custom.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.core.models.GroupedOpenApi;

@Configuration
public class Knife4jConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(
                new Info()
                        .title( "后台管理系统API" )
                        .version( "1.0" )
                        .description( "后台管理系统API" )
        );
    }

    @Bean
    public GroupedOpenApi systemAPI() {
        return GroupedOpenApi.builder().group( "系统信息管理" )
                .pathsToMatch( "/admin/system/**" )
                .build();
    }

    @Bean
    public GroupedOpenApi loginAPI() {
        return GroupedOpenApi.builder().group( "后台登录管理" )
                .pathsToMatch(
                        "/admin/login/**",
                        "/admin/info" )
                .build();
    }

    @Bean
    public GroupedOpenApi apartmentAPI() {
        return GroupedOpenApi.builder().group( "公寓信息管理" )
                .pathsToMatch(
                        "/admin/apartment/**",
                        "/admin/room/**",
                        "/admin/label/**",
                        "/admin/facility/**",
                        "/admin/fee/**",
                        "/admin/attr/**",
                        "/admin/payment/**",
                        "/admin/region/**",
                        "/admin/term/**",
                        "/admin/file/**" )
                .build();
    }

    @Bean
    public GroupedOpenApi userAPI() {
        return GroupedOpenApi.builder().group( "平台用户管理" )
                .pathsToMatch( "/admin/user/**" )
                .build();
    }

}