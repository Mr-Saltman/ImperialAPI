package com.example.imperialapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    Converter converter = new Converter();

    @Test
    public void testInchToCm(){
        // Arrange
        double inch = 3;
        double expectedResult = 7.62;

        // Act
        double result = converter.InchToCm(inch);

        // Assert
        Assertions.assertEquals(expectedResult, result);


    }
}
