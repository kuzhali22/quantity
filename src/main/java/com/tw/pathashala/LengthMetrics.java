package com.tw.pathashala;

public enum LengthMetrics {
    CENTIMETER(1),
    METER(100),
    KILOMETER(100000);

    private int unitValue;

    LengthMetrics(int unit) {
        this.unitValue = unit;
    }

    public int getUnitValue() {
        return unitValue;
    }
}
