package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's phone number in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPhone(String)}
 */
public class Contact {

    public static final String EXAMPLE = new String();
    public static final String MESSAGE_CONTACT_DETAIL_CONSTRAINTS = new String();
    public static final String CONTACT_DETAIL_VALIDATION_REGEX = new String();

    public final String contactDetail;
    private boolean isPrivate;

    /**
     * Validates given phone number.
     *
     * @throws IllegalValueException if given phone string is invalid.
     */
    public Contact(String phone, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        String trimmedPhone = phone.trim();
        if (!isValidPhone(trimmedPhone)) {
            throw new IllegalValueException(MESSAGE_CONTACT_DETAIL_CONSTRAINTS);
        }
        this.contactDetail = trimmedPhone;
    }

    /**
     * Returns true if the given string is a valid person phone number.
     */
    public static boolean isValidPhone(String test) {
        return test.matches(CONTACT_DETAIL_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return contactDetail;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.contactDetail.equals(((Contact) other).contactDetail)); // state check
    }

    @Override
    public int hashCode() {
        return contactDetail.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
