package com.quantitymeasurement;

/**
 * Purpose : To calculate Quantity Measurement System
 *
 * @author Sreelipta
 * @since 2021-10-30
 */

public class QuantityMeasurement {
    private final UnitMeasurement unit;
    public double value;

    public QuantityMeasurement(UnitMeasurement unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    /**
     * Purpose : This method is comparing the lengths
     *
     * @param that : which is taking a length
     * @return : compared value
     */

    public boolean compare(QuantityMeasurement that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        return Double.compare(this.unit.convertToBaseUnit(this), that.unit.convertToBaseUnit(that)) == 0;
    }

    /**
     * Purpose : To override the equals() method for checking equality and values of two object references
     *
     * @param o : The parameter is taking Object class reference
     * @return : checked value of two objects
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement length = (QuantityMeasurement) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}
