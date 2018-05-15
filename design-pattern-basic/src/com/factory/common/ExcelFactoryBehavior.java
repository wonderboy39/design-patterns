package com.factory.common;

import com.factory.domain.ExcelVO;
import com.factory.domain.JasperVO;

public class ExcelFactoryBehavior implements JasperFactoryBehavior {
    @Override
    public JasperVO createValueObject() {
        System.out.println("[ExcelFactoryBehavior]");
        return new ExcelVO();
    }
}
