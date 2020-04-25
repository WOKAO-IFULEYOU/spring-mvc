package com.beyond.spring.mvc.web.cotroller;

import com.beyond.spring.mvc.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    public static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    TestService testService;

    //url路径没有后缀或者后缀为/hello-spring-mvc，都会来到这里
    @RequestMapping(value = {"","/hello-spring-mvc"}, method = RequestMethod.GET)
    public String getHello() {
        //这种方式叫跳转到hello.jsp,因为在spring-mvc.xml中配置了文件到前缀与后缀
        return "hello";
    }

    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public String getSuccess() {

        String str = testService.getString();
        logger.info("{}", str);

        //这种方式叫跳转到success.jsp,因为在spring-mvc.xml中配置了文件到前缀与后缀
        return "success";

//        //这种方式叫重定向到success.jsp,因为在spring-mvc.xml中配置了文件到前缀与后缀
//        return "redirect:/success";
    }
}
