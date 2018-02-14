package seedu.addressbook.data.person;

import javafx.geometry.Pos;

public class PostalCode {
    private final int postalCode;

<<<<<<< Updated upstream
    public Block(int postalCode) {
        this.postalCode = postalCode;
    }

=======
    public PostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    private int getPostalCode() {
        return postalCode;
    }

>>>>>>> Stashed changes
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof PostalCode // instanceof handles nulls
<<<<<<< Updated upstream
                && this.postalCode == other.postalCode); // postalCode state check
=======
                && this.getPostalCode() == ((PostalCode) other).getPostalCode());
>>>>>>> Stashed changes
    }

    @Override
    public String toString() {
<<<<<<< Updated upstream
        return postalCode;
=======
        return postalCode + "";
>>>>>>> Stashed changes
    }
}
