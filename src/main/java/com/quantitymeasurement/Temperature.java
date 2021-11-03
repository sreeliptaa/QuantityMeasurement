package com.quantitymeasurement;

import java.util.function.Function;

/**
 * Purpose : To creating enums as instance variables which implements UnitMeasurement class
 */

public enum Temperature implements UnitMeasurement {
    FAHRENHEIT(true), CELSIUS(false);
    final Function<Double, Double> degreeFahrenheitToCelsius = (Double degreeFahrenheit) ->
            (degreeFahrenheit - 32) * 5 / 9;
    final Function<Double, Double> degreeCelsiusToCelsius = (Double degreeCelsius) ->
            degreeCelsius;
    final Function<Double, Double> conversionValue;

    Temperature(boolean isFahrenheit) {
        if (isFahrenheit) this.conversionValue = degreeFahrenheitToCelsius;
        else this.conversionValue = degreeCelsiusToCelsius;
    }

    /**
     * Purpose : To override the convertToBaseUnit() method
     *
     * @param quantityMeasurement : this parameter takes unit temperature for conversion
     * @return the conversion value
     */

    @Override
    public double convertToBaseUnit(QuantityMeasurement quantityMeasurement) {

        return conversionValue.apply(quantityMeasurement.value);
    }
}
