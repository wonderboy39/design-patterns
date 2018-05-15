package com.factory.common;

import com.factory.domain.DocsVO;
import com.factory.domain.JasperVO;

public class DocsFactoryBehavior implements JasperFactoryBehavior {

    @Override
    public JasperVO createValueObject() {
        System.out.println("[DocFactoryBehavior]");
        return new DocsVO();
    }
}
