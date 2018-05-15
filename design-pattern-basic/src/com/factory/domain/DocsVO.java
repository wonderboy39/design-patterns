package com.factory.domain;

public class DocsVO extends JasperVO{
    @Override
    public String createFile(String fileName) {
        System.out.println(" 물리적인 파일 생성 처리 ");
        System.out.println(" I'm an Doc Object. " + fileName + ".doc " + "will be created soon. ");
        return fileName + ".doc";
    }
}
