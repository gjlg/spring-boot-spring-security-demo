package com.mori.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yun_kai
 * @date 2022年07月15日, 0015
 */
@Api(tags = "你好世界！")
@RestController
@RequestMapping("/v1")
public class HelloController {

    @ApiOperation(value = "HELLO接口！")
    @GetMapping(value = "/hello")
    @PreAuthorize("hasAuthority('test')")
    public String hello() {
        return "hello";
    }
}
