package com.factory.domain;

public class ExcelVO extends JasperVO {
    @Override
    public String createFile(String fileName) {
        System.out.println(" 물리적인 파일 생성 처리 ");
        System.out.println("I'm an Excel Object. Excel File "+ fileName + ".xls" +" will be wrote soon. ");
        return fileName + ".xls";
    }
}
