package seedu.addressbook.data.person;

public class Street {
    private final String street;

<<<<<<< Updated upstream
    public Block(String street) {
        this.street = street;
    }

=======
    public Street(String street) {
        this.street = street;
    }

    private String getStreet() {
        return street;
    }

>>>>>>> Stashed changes
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Street // instanceof handles nulls
<<<<<<< Updated upstream
                && this.street.equals(other.street)); // street state check
=======
                && this.getStreet().equals(((Street) other).getStreet()));
>>>>>>> Stashed changes

    }

    @Override
    public String toString() {
        return street;
    }
}
