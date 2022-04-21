package quantitymeasurement;

public enum WeightUnits implements Units {
    GRAM(1), KG(1000), TONNE(1000 * 1000);

    public double unit;

    WeightUnits(double units) {
        this.unit = units;
    }

    @Override
    public double unitConversion(Double value) {
        return unit * value;
    }


}
