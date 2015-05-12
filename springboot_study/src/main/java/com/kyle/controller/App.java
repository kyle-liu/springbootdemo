package com.kyle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 *
 * @author canhun@taobao.com
 * @version $Id: App.java, v 0.1 2015-04-21 11:48 jinyu.qu Exp $
 */
@RestController
public class App {
    @RequestMapping("/")
    String home() {
        return "hello";
    }
}
