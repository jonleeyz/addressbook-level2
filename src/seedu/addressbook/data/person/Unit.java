package seedu.addressbook.data.person;

public class Unit {
    private final String unit;

    public Unit(String unit) {
        this.unit = unit;
    }

    private String getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Unit // instanceof handles nulls
                && getUnit().equals(((Unit) other).getUnit()));
    }

    @Override
    public String toString() {
        return unit;
    }
}
