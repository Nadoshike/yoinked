package com.mrstride;

import org.springframework.stereotype.Component;
import org.apache.logging.log4j.Logger;

@Component
public class Actor1 implements MyBehavior {
    
    @Override
    public void act() {
        System.out.println("I can act!");
    }

    public boolean earnAnOscar(Logger logger) {
        logger.info("I earned an Oscar!");
        return true;
    }
}