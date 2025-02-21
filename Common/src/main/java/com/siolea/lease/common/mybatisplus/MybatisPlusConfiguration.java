package com.siolea.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan( "com.siolea.lease.web.*.mapper" )
public class MybatisPlusConfiguration {

}