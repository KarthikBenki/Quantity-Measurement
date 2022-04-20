package quantitymeasurement;

public enum Units {
    FEET(12),INCH(1),YARD(36.0),CM(2.54);//let inch as base unit

    public double unit;

    Units(double unit) {
        this.unit = unit;
    }
}

