package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void TestLogger() {
        //Given
        Logger.getInstance().log("cokolwiek1");
        Logger.getInstance().log("cokolwiek2");

        //When
        String log = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("cokolwiek2", log);
    }
}
