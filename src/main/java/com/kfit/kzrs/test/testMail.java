package com.kfit.kzrs.test;

import com.kfit.kzrs.core.MailSender;
import com.kfit.kzrs.enums.MailContentTypeEnum;

import java.util.ArrayList;

/**
 * Created by zjutK on 2018/7/18.
 */
public class testMail {
    public static void main(String[] args) throws Exception
    {
        new MailSender()
                .title("测试SpringBoot发送邮件")
                .content("简单文本内容发送")
                .contentType(MailContentTypeEnum.TEXT)
                .targets(new ArrayList<String>(){{
                    add("jnyuqy@dingtalk.com");
                }})
                .send();
    }
}
