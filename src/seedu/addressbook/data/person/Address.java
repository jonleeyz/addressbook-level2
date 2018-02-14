package seedu.addressbook.data.person;

import java.util.Objects;
import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    public static final String ADDRESS_COMPONENT_SPLIT_REGEX = ", ";

    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        String[] processedAddress = splitAddressIntoComponents(trimmedAddress);
        assignAddressComponents(processedAddress);
<<<<<<< Updated upstream
=======
    }

    private Block getBlock() {
        return block;
    }

    private Street getStreet() {
        return street;
    }

    private Unit getUnit() {
        return unit;
    }

    private PostalCode getPostalCode() {
        return postalCode;
>>>>>>> Stashed changes
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    public void assignAddressComponents(String[] addressComponents) {
        block = new Block(Integer.parseInt(addressComponents[0]));
        street = new Street(addressComponents[1]);
        unit = new Unit(addressComponents[2]);
        postalCode = new PostalCode(Integer.parseInt(addressComponents[3]));
    }

    public static String[] splitAddressIntoComponents(String rawAddress) {
        return rawAddress.split(ADDRESS_COMPONENT_SPLIT_REGEX);
    }

    @Override
    public String toString() {
        return block + ADDRESS_COMPONENT_SPLIT_REGEX
                + street + ADDRESS_COMPONENT_SPLIT_REGEX
                + unit + ADDRESS_COMPONENT_SPLIT_REGEX
                + postalCode;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
<<<<<<< Updated upstream
                && this.block.equals(((Address) other).block); // block state check
                && this.street.equals(((Address) other).street); // street state check
                && this.unit.equals(((Address) other).unit); // unit state check
                && this.postalCode.equals(((Address) other).postalCode)); // postalCode state check
=======
                && this.block.equals(((Address) other).getBlock()) // block state check
                && this.street.equals(((Address) other).getStreet()) // street state check
                && this.unit.equals(((Address) other).getUnit()) // unit state check
                && this.postalCode.equals(((Address) other).getPostalCode())); // postalCode state check
>>>>>>> Stashed changes
    }

    @Override
    public int hashCode() {
        return Objects.hash(block, street, unit, postalCode);
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}