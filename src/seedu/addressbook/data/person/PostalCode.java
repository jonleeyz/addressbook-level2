package seedu.addressbook.data.person;

public class PostalCode {
    private final int postalCode;

    public PostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    private int getPostalCode() {
        return postalCode;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof PostalCode // instanceof handles nulls
                && getPostalCode() == ((PostalCode) other).getPostalCode());
    }

    @Override
    public String toString() {
        return postalCode + "";
    }
}
