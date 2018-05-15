package com.factory.domain;

public class ExcelVO extends JasperVO {
    @Override
    public void createFile(String fileName) {
        System.out.println("I'm an Excel Object. Excel File "+ fileName + ".xls" +" will be wrote soon. ");
    }
}
