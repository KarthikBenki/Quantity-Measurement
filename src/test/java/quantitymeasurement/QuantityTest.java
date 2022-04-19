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
    @Test
    public void givenSameValuesInDifferentObjects_shouldReturnEqual() {
        Feet feet = new Feet();
        feet.setValue(3);
        Feet feet1 = new Feet();
        feet1.setValue(3);
        Assert.assertEquals(feet.getValue(),feet1.getValue(),0.0);
    }
    @Test
    public void givenDifferentValuesInDifferentObjects_shouldReturnNotEqual() {
        Feet feet = new Feet();
        feet.setValue(3);
        Feet feet1 = new Feet();
        feet1.setValue(4);
        Assert.assertNotEquals(feet.getValue(),feet1.getValue(),0.0);
    }
    /*
    check for 0 inch and 0 inch
     */
    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1,inch2);
    }
    /*
    0 inch and 1 inch not equal
     */
    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1,inch2);
    }
    /*
    comparing the object with null
     */
    @Test
    public void givenInchObjectWhenComparedWithNullValue_shouldReturnFalse() {
        Inch inch1 = new Inch(0.0);
        Assert.assertFalse(inch1.equals(null));
        Assert.assertNotNull(inch1);
        Assert.assertNotEquals(null,inch1);
    }

    /*
    reference check
     */
    @Test
    public void givenInchReferenceObject_WhenSame_ShouldReturnTrue() {
        Inch inch = new Inch(0.0);
        Assert.assertSame(inch,inch);
    }

    @Test
    public void givenInchReferenceObject_WhenNotSame_ShouldReturnTrue() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.0);
        Assert.assertNotSame(inch,inch1);
    }

    /*
    type check for two objects
     */
    @Test
    public void givenTwoTypesOfObject_WhenNotEqual_ShouldReturnTrue() {
        Inch inch = new Inch(0.0);
        Feet feet = new Feet(0.0);
        Assert.assertNotEquals(inch, feet);
    }




}
