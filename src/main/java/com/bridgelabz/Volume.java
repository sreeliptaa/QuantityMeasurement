package com.bridgelabz;

/**
 * Purpose : To create enums as instance variables which implements UnitMeasurement class
 *
 * @author Sreelipta
 * @version 11.0.11
 * @since 2021-10-30
 */

public enum Volume implements UnitMeasurement {
    GALLON(3.78), LITRE(1.0), MILLILITRE(0.001);

    private final double conversionValue;

    Volume(double convertToBaseUnit) {

        this.conversionValue = convertToBaseUnit;
    }

    /**
     * Purpose : This method used to convert into base value
     *
     * @param quantityMeasurement : this parameter takes unit volume for conversion
     * @return the conversion value
     */

    @Override
    public double convertToBaseUnit(QuantityMeasurement quantityMeasurement) {

        return quantityMeasurement.value * conversionValue;
    }
}
