package com.kyle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 *
 * @author canhun@taobao.com
 * @version $Id: Application.java, v 0.1 2015-04-21 11:35 jinyu.qu Exp $
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
            SpringApplication.run(Application.class);
        }
}
