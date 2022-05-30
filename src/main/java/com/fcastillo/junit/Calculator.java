package com.fcastillo.junit;

/**
 *
 * @author Francisco Castillo
 */
public class Calculator {

    private CalculatorOracleCloud calculatorOracleCloud;

    public double add(double a, double b) {
        return a + b;
    }

    public double addInCloud(double a, double b) {
        //dependencia
        return calculatorOracleCloud.addInOracleCloud(a, b);
    }

}
