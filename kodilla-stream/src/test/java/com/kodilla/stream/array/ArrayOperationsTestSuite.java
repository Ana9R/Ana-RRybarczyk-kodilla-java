package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers1 = new int[20];
        numbers1[0] = 5;
        numbers1[1] = 98;
        numbers1[2] = 16;
        numbers1[3] = 9;
        numbers1[4] = 86;
        numbers1[5] = 31;
        numbers1[6] = 24;
        numbers1[7] = 56;
        numbers1[8] = 5;
        numbers1[9] = 18;
        numbers1[10] = 61;
        numbers1[11] = 67;
        numbers1[12] = 33;
        numbers1[13] = 50;
        numbers1[14] = 14;
        numbers1[15] = 6;
        numbers1[16] = 3;
        numbers1[17] = 72;
        numbers1[18] = 17;
        numbers1[19] = 51;

        //When
        double averageNumber = ArrayOperations.getAverage(numbers1);

        //Then

        Assert.assertEquals(36.1, averageNumber, 0.0002);
    }
}
