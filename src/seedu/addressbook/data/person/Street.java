package seedu.addressbook.data.person;

public class Street {
    private final String street;

    public Block(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Street // instanceof handles nulls
                && this.street.equals(other.street)); // street state check

    }

    @Override
    public String toString() {
        return street;
    }
}
