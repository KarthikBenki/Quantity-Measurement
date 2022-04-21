package quantitymeasurement;

public class QuantityMeasurement {
    double feet;
    double inch;

    public double unitConversion(LengthUnits units, Double value) {
        return units.unit * value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.feet, feet) == 0 &&
                Double.compare(that.inch, inch) == 0;
    }


}
