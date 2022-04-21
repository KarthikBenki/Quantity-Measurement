package quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementWeightsTest {
    private QuantityMeasurement quantityMeasurement;

    @Before
    public void init() {
        quantityMeasurement = new QuantityMeasurement();
    }

    /*
    as a math student i wish to compare and add weights in gram
     */
    /*
    0 grams = 0 grams
     */
    @Test
    public void given0Gramand0GramWhenEqual_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(WeightUnits.GRAM, 0.0);
        double value2 = quantityMeasurement.unitConversion(WeightUnits.GRAM, 0.0);
        Assert.assertEquals(value1, value2, 0);
    }

    /*
    1 kg = 1000 grams
     */
    @Test
    public void given1KGand1000GramsWhenEqual_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(WeightUnits.KG, 1.0);
        double value2 = quantityMeasurement.unitConversion(WeightUnits.GRAM, 1000.0);
        Assert.assertEquals(value1, value2, 0);
    }

    /*
    1 kg = 1000 grams
     */
    @Test
    public void given1Tonneand1000KGWhenEqual_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(WeightUnits.TONNE, 1.0);
        double value2 = quantityMeasurement.unitConversion(WeightUnits.KG, 1000.0);
        Assert.assertEquals(value1, value2, 0);
    }

    /*
    1 tonne + 1000 gm = 1001 kg
     */
    @Test
    public void givenOneTonneAndThousandgramsWhenAdded_ShouldReturn1001KG() {
        double value1 = quantityMeasurement.unitAddition(WeightUnits.TONNE, 1.0, WeightUnits.GRAM, 1000.0);
        double value2 = quantityMeasurement.unitConversion(WeightUnits.KG, 1001.0);
        Assert.assertEquals(value1, value2, 0);
    }


}
