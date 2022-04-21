package quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementVolumeTest {
    private QuantityMeasurement quantityMeasurement;

    @Before
    public void init() {
        quantityMeasurement = new QuantityMeasurement();
    }

    /*
    as a math student i wish to compare volume in litre and gallon
     */
    /*
    0gallon == 0 gallon
     */
    @Test
    public void given0Gallonand0GallonWhenEqual_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(VolumeUnits.GALLON, 0.0);
        double value2 = quantityMeasurement.unitConversion(VolumeUnits.GALLON, 0.0);
        Assert.assertEquals(value1, value2, 0);
    }

    /*
    1 gallon = 3.78 litres
     */
    @Test
    public void given1GallonandThreepointSevenEightLitersWhenEqual_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(VolumeUnits.GALLON, 1.0);
        double value2 = quantityMeasurement.unitConversion(VolumeUnits.LITRE, 3.78);
        Assert.assertEquals(value1, value2, 0);
    }

    /*
    1 liters == 1000 ml
     */
    @Test
    public void given1litreand1000MilliLitersWhenEqual_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(VolumeUnits.LITRE, 1.0);
        double value2 = quantityMeasurement.unitConversion(VolumeUnits.MILLILITER, 1000.0);
        Assert.assertEquals(value1, value2, 0);
    }

    /*
    1 gallon +3.78 liters =7.56 liters
     */
    @Test
    public void givenOneGallonAndThreePointSevenEightLitersWhenAdded_ShouldReturnSevenPointFiveSixLiters() {
        double value1 = quantityMeasurement.unitAddition(VolumeUnits.GALLON,1.0,VolumeUnits.LITRE,3.78);
        double value2 = quantityMeasurement.unitConversion(VolumeUnits.LITRE, 7.56);
        Assert.assertEquals(value1, value2, 0);
    }

    /*
    1 litre + 1000 ml = 2 litres
     */
    @Test
    public void givenOneLitreAndThousandMillilitersWhenAdded_ShouldReturnTwoLiters() {
        double value1 = quantityMeasurement.unitAddition(VolumeUnits.LITRE,1.0,VolumeUnits.MILLILITER,1000);
        double value2 = quantityMeasurement.unitConversion(VolumeUnits.LITRE, 2.0);
        Assert.assertEquals(value1, value2, 0);
    }
}
