package com.mrstride;

import org.springframework.stereotype.Component;
import org.apache.logging.log4j.Logger;

@Component
public class Actor2 implements MyBehavior {

    @Override
    public void act() {
        System.out.println("I am acting in a different way!");
    }

    public boolean earnAnOscar(Logger logger) {
        logger.info("Actor2 earned an Oscar!");
        return true;
    }
}
