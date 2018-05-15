package com.factory.domain;

import com.factory.common.JasperFactoryBehavior;

public class JasperVO {
    private String title;
    private String body;
    private String template;
    private String filePath;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String createFile(String fileName){
        System.out.println("I'm a Jasper Object.... ");
        return "jasper";
    }

    public String createFile(String fileName, String serviceName){
        // 나중에 구현 ...
        return "";
    }
}
