package com.factory.test;

import com.factory.common.DocsFactoryBehavior;
import com.factory.common.ExcelFactoryBehavior;
import com.factory.common.JasperFactory;
import com.factory.domain.JasperVO;

public class TestFactory1 {
    public static void main(String [] args){
        JasperVO docVO = JasperFactory.createJasperCommonObject(new DocsFactoryBehavior());
        JasperVO excelVO = JasperFactory.createJasperCommonObject(new ExcelFactoryBehavior());

        System.out.println("");
        docVO.createFile("helloDoc");
        excelVO.createFile("helloExcel");
    }
}
