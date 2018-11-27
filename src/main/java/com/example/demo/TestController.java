package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 版权所有：© www.nh301.com
 *
 * @author Arains <br/>
 * @email wjy@nh301.com <br/>
 * @project RFCRM  <br/>
 * @Version 1.0 , @Time： 2018年11月17 <br/>
 * <p>
 * <p>
 * <p>
 * 区分　  责任人　  日期　　　　       说明
 * 创建　  Arains 　 2018年11月17日      <br/>
 */
@RestController
@EnableAutoConfiguration
public class TestController {

    @RequestMapping("/hello")
    private String index(){
        return "Hello World!";
    }
}