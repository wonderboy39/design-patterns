package com.factory.common;

import com.factory.domain.JasperVO;

public class JasperFactory {
    private JasperFactoryBehavior behavior;

    public void setBehavior(JasperFactoryBehavior behavior){
        this.behavior = behavior;
    }

    public JasperVO createValueObject(){
        return behavior.createValueObject();
    }

    public static JasperVO createJasperCommonObject (JasperFactoryBehavior behavior){
        return behavior.createValueObject();
    }

}
