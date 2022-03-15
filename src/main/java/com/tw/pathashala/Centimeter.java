package com.tw.pathashala;

public class Centimeter {

    private final double magnitude;

    private Centimeter(double magnitude) {
        this.magnitude = magnitude;
    }

    public static Centimeter createCentimeter(double magnitude) {
        return new Centimeter(magnitude);
    }

    public static Centimeter createMeter(double magnitude) {
        return new Centimeter(MetricConversionUtility.convertMeter(magnitude, LengthMetrics.METER));

    }

    public static Centimeter createKilometer(double magnitude) {
        return new Centimeter(MetricConversionUtility.convertMeter(magnitude, LengthMetrics.KILOMETER));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Centimeter that = (Centimeter) obj;
        return magnitude == that.magnitude;
    }
}
