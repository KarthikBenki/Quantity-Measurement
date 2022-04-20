package quantitymeasurement;

public enum Units {
    FEET(30),INCH(2.5),YARD(90),CM(1);//let inch as base unit

    public double unit;

    Units(double units) {
        this.unit = units;
    }
}

