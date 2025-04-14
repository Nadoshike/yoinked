package com.mrstride;

import org.junit.Test;
import org.mockito.Mockito;
import org.apache.logging.log4j.Logger;
import static org.junit.Assert.assertEquals;

public class Actor1Test {

    @Test
    public void testEarnAnOscarMethod() {
        // Arrange
        Actor1 actor = new Actor1();  // Creating the actor instance
        Logger logger = Mockito.mock(Logger.class);  // Mocking Logger

        // Act
        boolean result = actor.earnAnOscar(logger);  // Calling the method to test

        // Assert
        assertEquals(true, result);  // Verifying that the result is true
        Mockito.verify(logger).info("I earned an Oscar!");  // Verifying the log message
    }
}
