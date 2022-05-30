package com.fcastillo.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *
 * @author fcastillo
 */
@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

    @InjectMocks
    Calculator calculator = new Calculator();

    @Mock
    CalculatorOracleCloud calculatorOracleCloud;

    @Test
    public void testAdd() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void testAddInCloud(){
        when(calculatorOracleCloud.addInOracleCloud(5,1)).thenReturn(6.0);
        assertEquals(6,calculatorOracleCloud.addInOracleCloud(5,1));
    }
}
