package com.quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_SouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetandNullFeet_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1FeetFromReference_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenType0Feetand1Feet_ShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }


    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNullInch_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenReference0InchAnd1Inch_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenType0InchAnd1Inch_ShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given2FeetAnd12Inch_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 2.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given3Feetand1Yard_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 3.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Yard_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);

    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 36.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Centimeterand0Centimeter_ShouldReturnEqual() {
        QuantityMeasurement centimeter1 = new QuantityMeasurement(Length.CENTIMETER, 0.0);
        QuantityMeasurement centimeter2 = new QuantityMeasurement(Length.CENTIMETER, 0.0);
        boolean compareCheck = centimeter1.compare(centimeter2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0Centimeterand1Centimeter_ShouldReturnNotEqual() {
        QuantityMeasurement centimeter1 = new QuantityMeasurement(Length.CENTIMETER, 0.0);
        QuantityMeasurement centimeter2 = new QuantityMeasurement(Length.CENTIMETER, 1.0);
        boolean compareCheck = centimeter1.compare(centimeter2);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given0CentimeterandNullCentimeter_ShouldReturnNotEqual() {
        QuantityMeasurement centimeter1 = new QuantityMeasurement(Length.CENTIMETER, 0.0);
        QuantityMeasurement centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0Centimeterand1CentimeterFromRef_ShouldReturnNotEqual() {
        QuantityMeasurement centimeter1 = new QuantityMeasurement(Length.CENTIMETER, 0.0);
        QuantityMeasurement centimeter2 = new QuantityMeasurement(Length.CENTIMETER, 1.0);
        boolean compareCheck = centimeter1.compare(centimeter2);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given2InchAnd5Centimeter_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(Length.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(centimeter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given5CentimeterAnd2Inch_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurement centimeter = new QuantityMeasurement(Length.CENTIMETER, 5.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
        boolean compareCheck = centimeter.compare(inch);
        Assertions.assertTrue(compareCheck);
    }
}
