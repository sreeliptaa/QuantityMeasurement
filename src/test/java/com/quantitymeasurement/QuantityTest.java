package com.quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_SouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetandNullFeet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1FeetFromReference_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenType0Feetand1Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }


    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNullInch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenReference0InchAnd1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenType0InchAnd1Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqual() {
        Feet feet1 = new Feet(1.0);
        double actualResult = feet1.feetToInchConversion();
        double expectedResult = 12;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void given2FeetAnd12Inch_WhenCompared_ShouldReturnNotEqual() {
        Feet feet = new Feet(2.0);
        double actualResult = feet.feetToInchConversion();
        double expectedResult = 12;
        Assertions.assertNotEquals(actualResult, expectedResult);
    }

    @Test
    public void given3Feetand1Yard_WhenCompared_ShouldReturnEqual() {
        Feet feet = new Feet(3.0);
        double actualResult = feet.feetToYardConversion();
        double expectedResult = 1;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void given1Feetand1Yard_WhenCompared_ShouldReturnNotEqual() {
        Feet feet = new Feet(1.0);
        double actualResult = feet.feetToYardConversion();
        double expectedResult = 1;
        Assertions.assertNotEquals(actualResult, expectedResult);

    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        Inch inch = new Inch(1.0);
        double actualResult = inch.inchToYardConversion();
        double expectedResult = 1;
        Assertions.assertNotEquals(actualResult, expectedResult);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnEqual() {
        Yard yard = new Yard(1.0);
        double actualResult = yard.yardToInchConversion();
        double expectedResult = 36;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnEqual() {
        Inch inch = new Inch(36.0);
        double actualResult = inch.inchToYardConversion();
        double expectedResult = 1;
        Assertions.assertEquals(actualResult, expectedResult);
    }
}
