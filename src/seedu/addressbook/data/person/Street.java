package seedu.addressbook.data.person;

public class Street {
    private final String street;

    public Street(String street) {
        this.street = street;
    }

    private String getStreet() {
        return street;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Street // instanceof handles nulls
                && getStreet().equals(((Street) other).getStreet()));
    }

    @Override
    public String toString() {
        return street;
    }
}
