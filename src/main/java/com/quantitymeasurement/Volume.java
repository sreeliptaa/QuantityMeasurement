package com.quantitymeasurement;

/**
 * Purpose : To create Interface which implements UnitMeasurement class
 */

public enum Volume implements UnitMeasurement {
    GALLON(3.78), LITRE(1.0), MILLILITRE(0.001);

    private final double conversionValue;

    Volume(double conversionValue) {
        this.conversionValue = conversionValue;
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
