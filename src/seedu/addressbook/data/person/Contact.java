package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's phone number in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPhone(String)}
 */
public abstract class Contact {

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
    public Contact(String value, boolean isPrivate, String constraintMessage, String validationRegex)
            throws IllegalValueException {
        this.isPrivate = isPrivate;
        String trimmedValue = value.trim();
        if (!isValidContactDetail(trimmedValue)) {
            throw new IllegalValueException(MESSAGE_CONTACT_DETAIL_CONSTRAINTS);
        }
        this.contactDetail = trimmedValue;
        this.MESSAGE_CONTACT_DETAIL_CONSTRAINTS = constraintMessage;
        this.CONTACT_DETAIL_VALIDATION_REGEX = validationRegex;
    }

    /**
     * Returns true if the given string is a valid person phone number.
     */
    public static boolean isValidContactDetail(String test) {
        return test.matches(CONTACT_DETAIL_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return contactDetail;
    }

    @Override
    public abstract boolean equals(Object other);

    @Override
    public int hashCode() {
        return contactDetail.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
