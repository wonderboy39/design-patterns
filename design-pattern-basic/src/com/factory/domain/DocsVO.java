package com.factory.domain;

public class DocsVO extends JasperVO{
    @Override
    public void createFile(String fileName) {
        System.out.println("I'm an Doc Object. " + fileName + ".doc " + "will be created soon. ");
    }
}
