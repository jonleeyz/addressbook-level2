package seedu.addressbook.data.person;

import javafx.geometry.Pos;

public class PostalCode {
    private final int postalCode;

    public Block(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof PostalCode // instanceof handles nulls
                && this.postalCode == other.postalCode); // postalCode state check
    }

    @Override
    public String toString() {
        return postalCode;
    }
}
