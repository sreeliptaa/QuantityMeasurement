package com.quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_SouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetandNullFeet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1FeetFromReference_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenType0Feetand1Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }


    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNullInch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenReference0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenType0InchAnd1Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertNotEquals(feet, inch);
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqual() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        double actualResult = feet.feetToInchConversion();
        double expectedResult = 12;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void given2FeetAnd12Inch_WhenCompared_ShouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET, 2.0);
        double actualResult = feet.feetToInchConversion();
        double expectedResult = 12;
        Assertions.assertNotEquals(actualResult, expectedResult);
    }

    @Test
    public void given3Feetand1Yard_WhenCompared_ShouldReturnEqual() {
        Length feet = new Length(Length.Unit.FEET, 3.0);
        double actualResult = feet.feetToYardConversion();
        double expectedResult = 1;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void given1Feetand1Yard_WhenCompared_ShouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        double actualResult = feet.feetToYardConversion();
        double expectedResult = 1;
        Assertions.assertNotEquals(actualResult, expectedResult);

    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        double actualResult = inch.inchToYardConversion();
        double expectedResult = 1;
        Assertions.assertNotEquals(actualResult, expectedResult);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnEqual() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        double actualResult = yard.yardToInchConversion();
        double expectedResult = 36;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnEqual() {
        Length inch = new Length(Length.Unit.INCH, 36.0);
        double actualResult = inch.inchToYardConversion();
        double expectedResult = 1;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnEqual() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        double actualResult = yard.yardToFeetConversion();
        double expectedResult = 3;
        Assertions.assertEquals(actualResult, expectedResult);
    }
}
