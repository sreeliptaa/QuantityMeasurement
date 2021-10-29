package com.quantitymeasurement;

public class Inch {
    private final double value;

    public Inch(double value) {
        this.value = value;
    }

    public double inchToFeetConversion() {
        return value / 12;
    }

    public double inchToYardConversion() {
        return value / 36;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }

}
