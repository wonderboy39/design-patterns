package com.factory;

import com.factory.common.DocsFactoryBehavior;
import com.factory.common.ExcelFactoryBehavior;
import com.factory.common.JasperFactory;
import com.factory.domain.DocsVO;
import com.factory.domain.JasperVO;

public class TestFactory {
    public static void main(String [] args){
        DocsVO docsVO = null;
        JasperVO docVO = JasperFactory.createJasperCommonObject(new DocsFactoryBehavior());
        JasperVO excelVO = JasperFactory.createJasperCommonObject(new ExcelFactoryBehavior());

        System.out.println("");
        docVO.createFile("helloDoc");
        excelVO.createFile("helloExcel");
    }
}
