package com.kfit.kzrs.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zjutK on 2018/7/18.
 */
public class MailEntity implements Serializable {
//    smtp服务器
    private String smtpService;
//    端口号
    private String smtpPort;
//    发送邮箱
    private String fromMailAddress;
//    SMTP口令
    private String fromMailSmtpPwd;
//    邮箱标题
    private String title;
//    邮件内容
    private String content;
//    内容格式
    private String contentType;
//    接收邮件集合
    private List<String> list = new ArrayList<String>();

    public String getSmtpService() {
        return smtpService;
    }

    public void setSmtpService(String smtpService) {
        this.smtpService = smtpService;
    }

    public String getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(String smtpPort) {
        this.smtpPort = smtpPort;
    }

    public String getFromMailAddress() {
        return fromMailAddress;
    }

    public void setFromMailAddress(String fromMailAddress) {
        this.fromMailAddress = fromMailAddress;
    }

    public String getFromMailSmtpPwd() {
        return fromMailSmtpPwd;
    }

    public void setFromMailSmtpPwd(String fromMailSmtpPwd) {
        this.fromMailSmtpPwd = fromMailSmtpPwd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contenType) {
        this.contentType = contenType;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
