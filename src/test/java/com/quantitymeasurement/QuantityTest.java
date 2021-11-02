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

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement actualSum = inch1.sumOfUnit(inch2, Length.INCH);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Length.INCH, 4.0);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement actualSum = feet.sumOfUnit(inch, Length.INCH);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Length.INCH, 14.0);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement actualSum = feet1.sumOfUnit(feet2, Length.INCH);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Length.INCH, 24.0);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given2InchAnd2Point5Centimeter_WhenAdded_ShouldReturn3Inch() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(Length.CENTIMETER, 2.5);
        QuantityMeasurement actualSum = inch.sumOfUnit(centimeter, Length.INCH);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Length.INCH, 3.0);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqual() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonAnd1Gallon_ShouldReturnNotEqual() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonAndNullGallon_ShouldReturnNotEqual() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void givenReference0GallonAnd1Gallon_ShouldReturnNotEqual() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0LitreAnd0Litre_ShouldReturnEqual() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITRE, 0.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    public void given0LitreAnd1Litre_ShouldReturnNotEqual() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITRE, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void given0LitreAndNullLitre_ShouldReturnNotEqual() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
        QuantityMeasurement litre2 = null;
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void givenReference0LitreAnd1Litre_ShouldReturnNotEqual() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITRE, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void given0MillilitreAnd0Millilitre_ShouldReturnEqual() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
        QuantityMeasurement millilitre2 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
        Assertions.assertEquals(millilitre1, millilitre2);
    }

    @Test
    public void given0MillilitreAnd1Millilitre_ShouldReturnNotEqual() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
        QuantityMeasurement millilitre2 = new QuantityMeasurement(Volume.MILLILITRE, 1.0);
        Assertions.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    public void given0MillilitreAndNullMillilitre_ShouldReturnNotEqual() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
        QuantityMeasurement millilitre2 = null;
        Assertions.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    public void givenReference0MillilitreAnd1Millilitre_ShouldReturnNotEqual() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
        QuantityMeasurement millilitre2 = new QuantityMeasurement(Volume.MILLILITRE, 1.0);
        Assertions.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    void given1GallonAnd3Point78Litre_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
        QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 3.78);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1LitreAnd1000Millilitre_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 1.0);
        QuantityMeasurement millilitre = new QuantityMeasurement(Volume.MILLILITRE, 1000);
        boolean compareCheck = litre.compare(millilitre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3Point78Litre_WhenAdded_ShouldReturn7Point57Litre() {
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
        QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 3.78);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Volume.LITRE, 7.56);
        QuantityMeasurement actualSum = gallon.sumOfUnit(litre, Volume.LITRE);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given1LitreAnd1000millilitre_WhenAdded_ShouldReturn2Litre() {
        QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 1.0);
        QuantityMeasurement millilitre = new QuantityMeasurement(Volume.MILLILITRE, 1000.0);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Volume.LITRE, 2.0);
        QuantityMeasurement actualSum = litre.sumOfUnit(millilitre, Volume.LITRE);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given0GramAnd0Gram_ShouldReturnEqual() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.GRAM, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    public void given0GramAnd1Gram_ShouldReturnNotEqual() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0GramAndNullGram_ShouldReturnNotEqual() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void givenReference0GramAnd1Gram_ShouldReturnNotEqual() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0KilogramAnd0Kilogram_ShouldReturnEqual() {
        QuantityMeasurement kilogram1 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        QuantityMeasurement kilogram2 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        Assertions.assertEquals(kilogram1, kilogram2);
    }

    @Test
    public void given0KilogramAnd1Kilogram_ShouldReturnNotEqual() {
        QuantityMeasurement kilogram1 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        QuantityMeasurement kilogram2 = new QuantityMeasurement(Weight.KILOGRAM, 1.0);
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    public void given0KilogramAndNullKilogram_ShouldReturnNotEqual() {
        QuantityMeasurement kilogram1 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        QuantityMeasurement kilogram2 = null;
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    public void givenReference0KilogramAnd1Kilogram_ShouldReturnNotEqual() {
        QuantityMeasurement kilogram1 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        QuantityMeasurement kilogram2 = new QuantityMeasurement(Weight.KILOGRAM, 1.0);
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    public void given0TonneAnd0Tonne_ShouldReturnEqual() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 0.0);
        QuantityMeasurement tonne2 = new QuantityMeasurement(Weight.TONNE, 0.0);
        Assertions.assertEquals(tonne1, tonne2);
    }

    @Test
    public void given0TonneAnd1Tonne_ShouldReturnNotEqual() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 0.0);
        QuantityMeasurement tonne2 = new QuantityMeasurement(Weight.TONNE, 1.0);
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    public void given0TonneAndNullTonne_ShouldReturnNotEqual() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 0.0);
        QuantityMeasurement tonne2 = null;
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    public void givenReference0TonneAnd1Tonne_ShouldReturnNotEqual() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 0.0);
        QuantityMeasurement tonne2 = new QuantityMeasurement(Weight.TONNE, 1.0);
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    public void given1KilogramAnd1000Gram_WhenCompared_ShouldReturnEqualWeight() {
        QuantityMeasurement kilogram = new QuantityMeasurement(Weight.KILOGRAM, 1.0);
        QuantityMeasurement gram = new QuantityMeasurement(Weight.GRAM, 1000);
        boolean compareCheck = kilogram.compare(gram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kilogram_WhenCompared_ShouldReturnEqualWeight() {
        QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 1.0);
        QuantityMeasurement kilogram = new QuantityMeasurement(Weight.KILOGRAM, 1000);
        boolean compareCheck = tonne.compare(kilogram);
        Assertions.assertTrue(compareCheck);
    }

}
