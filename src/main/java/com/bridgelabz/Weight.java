package com.bridgelabz;

/**
 * Purpose : To create enums as instance variables which implements UnitMeasurement class
 *
 * @author Sreelipta
 * @version 11.0.11
 * @since 2021-10-30
 */

public enum Weight implements UnitMeasurement {
    GRAM(0.001), KILOGRAM(1), TONNE(1000);

    private final double conversionValue;

    Weight(double convertToBaseUnit) {

        this.conversionValue = convertToBaseUnit;
    }

    /**
     * Purpose : This method used for convert into base value
     *
     * @param quantityMeasurement : this parameter takes unit weight for conversion
     * @return the conversion value
     */

    @Override
    public double convertToBaseUnit(QuantityMeasurement quantityMeasurement) {

        return quantityMeasurement.value * conversionValue;
    }
}
