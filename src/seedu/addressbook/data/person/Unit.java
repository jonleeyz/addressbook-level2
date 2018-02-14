package seedu.addressbook.data.person;

public class Unit {
    private final String unit;

<<<<<<< Updated upstream
    public Block(String unit) {
        this.unit = unit;
    }

=======
    public Unit(String unit) {
        this.unit = unit;
    }

    private String getUnit() {
        return unit;
    }

>>>>>>> Stashed changes
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Unit // instanceof handles nulls
<<<<<<< Updated upstream
                && this.unit.equals(other.unit));
=======
                && this.getUnit().equals(((Unit) other).getUnit()));
>>>>>>> Stashed changes
    }

    @Override
    public String toString() {
        return unit;
    }
}
