package com.tw.pathashala;

public class MetricConversionUtility {

    public static double convertMeter(double magnitude, LengthMetrics unit) {

        return magnitude * unit.getUnitValue();

    }
}
