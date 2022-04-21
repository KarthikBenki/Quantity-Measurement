package quantitymeasurement;

public enum VolumeUnits {
    GALLON(3.78*1000),
    LITRE(1000),
    MILLILITER(1);

    public double unit;

    VolumeUnits(double units) {
        this.unit=units;
    }
}
