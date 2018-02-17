package seedu.addressbook.commands;

import seedu.addressbook.common.Messages;
import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.data.person.UniquePersonList.PersonNotFoundException;
import seedu.addressbook.parser.Parser.Attribute;


/**
 * Edits a person identified using its last displayed index from the address book.
 */
public class EditCommand extends Command {

    public static final String COMMAND_WORD = "edit";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Edits an attribute of a person identified by the index number\n"
            + "used in the last find/list call.\n"
            + "Parameters: INDEX ATTRIBUTE NEW_VALUE\n"
            + "Example: " + COMMAND_WORD + " 1 name Ryan";

    public static final String MESSAGE_DELETE_PERSON_SUCCESS = "Deleted Person: %1$s";

    private final Attribute attribute;
    private final String newValue;


    public EditCommand(int targetVisibleIndex, Attribute attribute, String newValue) {
        super(targetVisibleIndex);
        this.attribute = attribute;
        this.newValue = newValue;
    }


    @Override
    public CommandResult execute() {
        try {
            final ReadOnlyPerson target = getTargetPerson();
            addressBook.removePerson(target);
            return new CommandResult(String.format(MESSAGE_DELETE_PERSON_SUCCESS, target));

        } catch (IndexOutOfBoundsException ie) {
            return new CommandResult(Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
        } catch (PersonNotFoundException pnfe) {
            return new CommandResult(Messages.MESSAGE_PERSON_NOT_IN_ADDRESSBOOK);
        }
    }

}
