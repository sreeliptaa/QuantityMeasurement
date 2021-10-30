package com.quantitymeasurement;

import java.util.Objects;

/**
 * Purpose : To simulate Quantity Measurement System
 *
 * @author Sreelipta
 * @since 2021-10-30
 */

public class Length {
    private final Unit unit;
    private final double value;

    public enum Unit {
        FEET, INCH, YARD
    }

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * Purpose : This method is used to convert feet into inches
     *
     * @return : atual value
     */
    public double feetToInchConversion() {
        return value * 12;
    }

    /**
     * Purpose : This method is used to convert feet into yard
     *
     * @return : atual value
     */

    public double feetToYardConversion() {
        return value / 3;
    }

    /**
     * Purpose : This method is used to convert inch into feet
     *
     * @return : atual value
     */

    public double inchToFeetConversion() {

        return value / 12;
    }

    /**
     * Purpose : This method is used to convert inch into yard
     *
     * @return : atual value
     */
    public double inchToYardConversion() {

        return value / 36;
    }

    /**
     * Purpose : This method is used to convert yard into feet
     *
     * @return : atual value
     */

    public double yardToFeetConversion() {

        return value * 3;
    }

    /**
     * Purpose : This method is used to convert yard into inch
     *
     * @return : atual value
     */

    public double yardToInchConversion() {

        return value * 36;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}
