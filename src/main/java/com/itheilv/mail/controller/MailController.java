package com.itheilv.mail.controller;

import cn.hutool.extra.mail.MailUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author WSQ
 * @since 2020-10-19
 */
@Controller
public class MailController {

    @GetMapping("/test")
    @ResponseBody
    public String testMail(){
        System.out.println("test");
        MailUtil.send("javaeewsq@163.com", "主题-测试", "邮件正文", false);
        System.out.println("发送邮件...");
        return "测试！！！";
    }
}
