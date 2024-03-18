package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    void plus(){

        assertEquals(5,cal.plus(2,3));
        assertEquals(10, cal.plus(3,7));
    }

    @Test
    void minus(){

        assertEquals(2,cal.minus(3,1));
    }

}