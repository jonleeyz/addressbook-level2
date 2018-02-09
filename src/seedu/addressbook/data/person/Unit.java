package seedu.addressbook.data.person;

public class Unit {
    private final String unit;

    public Block(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Unit // instanceof handles nulls
                && this.unit.equals(other.unit));
    }

    @Override
    public String toString() {
        return unit;
    }
}
