package com.kyle.controller;

import com.kyle.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 *
 * @author canhun@taobao.com
 * @version $Id: UserController.java, v 0.1 2015-04-21 11:33 jinyu.qu Exp $
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{id}")
    public User view(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setName("zhang");
        return user;
    }
}
