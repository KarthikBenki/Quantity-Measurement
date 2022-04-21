package quantitymeasurement;

public enum LengthUnits implements Units {
//    FEET(30),INCH(2.5),YARD(90),CM(1);//let cm as base unit
    FEET(12),INCH(1),YARD(36),CM(1/2.5);//let inch as base unit

    public double unit;

    LengthUnits(double units) {
        this.unit = units;
    }

    @Override
    public double unitConversion(Double value) {
        return unit * value;
    }


}

