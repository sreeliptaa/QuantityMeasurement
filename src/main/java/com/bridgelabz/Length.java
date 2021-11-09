package com.bridgelabz;

/**
 * Purpose : To creating enums as instance variables which implements UnitMeasurement class
 *
 * @author Sreelipta
 * @version 11.0.11
 * @since 2021-10-30
 */

public enum Length implements UnitMeasurement {
    INCH(1), CENTIMETER(0.4), FEET(12), YARD(36);

    private final double conversionValue;

    Length(double convertToBaseUnit) {

        this.conversionValue = convertToBaseUnit;
    }

    /**
     * Purpose : This method used to convert into base value
     *
     * @param quantityMeasurement : this parameter takes unit length for conversion
     * @return the conversion value
     */

    @Override
    public double convertToBaseUnit(QuantityMeasurement quantityMeasurement) {

        return quantityMeasurement.value * conversionValue;
    }
}
