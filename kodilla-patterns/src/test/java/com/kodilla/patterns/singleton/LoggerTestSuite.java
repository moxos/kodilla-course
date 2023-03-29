package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    public void firstTest(){
            Logger logger = Logger.INSTANCE;
            logger.log("First Test");
            Assertions.assertEquals("First Test", logger.getLastLog());

    }
}
