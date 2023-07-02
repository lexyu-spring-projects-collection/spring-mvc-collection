package com.lex.practice.controllers;

import com.lex.practice.api.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : Lex Yu
 * @date : 2023/7/2
 */
@Controller
public class TestController {

//    MyBean myBean = new MyBean();

    @Autowired
    MyBean myBean;

    @RequestMapping(value = "/testing")
    public void test(HttpServletResponse response) throws IOException {
        System.out.println(myBean.getWebsiteName()); // "This is a Website Name"
        response.getWriter().write("Old Website Name = " + myBean.getWebsiteName() + "\n");
        myBean.setWebsiteName("This is new name");
        System.out.println(myBean.getWebsiteName()); // "This is new name"
        response.getWriter().write("New Website Name = " + myBean.getWebsiteName() + "\n");
    }

    @RequestMapping(value = "/testing2")
    public void test2(HttpServletResponse response) throws IOException {
        response.getWriter().write("The Website Name = " + myBean.getWebsiteName() + "\n");
        System.out.println(myBean.getWebsiteName());
    }
}
