package quantitymeasurement;

public enum LengthUnits {
    FEET(30),INCH(2.5),YARD(90),CM(1);//let cm as base unit

    public double unit;

    LengthUnits(double units) {
        this.unit = units;
    }
}

