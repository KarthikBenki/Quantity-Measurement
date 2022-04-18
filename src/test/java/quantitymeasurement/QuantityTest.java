package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }
    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullFeetValue_shouldReturnFalse() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.0);
        Assert.assertFalse(feet.equals(null));
        Assert.assertNotNull(feet);
        Assert.assertNotEquals(null,feet);
    }

    @Test
    public void givenReferenceObject_WhenSame_ShouldReturnTrue() {
        Feet feet =new Feet(0.0);
        Feet feet1=new Feet(0.0) ;
        Assert.assertSame(feet,feet);
    }

    @Test
    public void givenReferenceObject_WhenNotSame_ShouldReturnTrue() {
        Feet feet =new Feet(0.0);
        Feet feet1=new Feet(0.0) ;
        Assert.assertNotSame(feet,feet1);
    }

    @Test
    public void giveSameTypesOfObjects_shouldReturnEqual() {
        Feet feet =new Feet();
        Assert.assertEquals(feet,feet);
    }

    @Test
    public void giveDifferentTypesOfObjects_shouldReturnNotEqual() {
        Feet feet =new Feet();
        Inch inch = new Inch();
        Assert.assertNotEquals(feet,inch);
    }
}
