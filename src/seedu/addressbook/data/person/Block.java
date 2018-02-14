package seedu.addressbook.data.person;

public class Block {
    private final int block;

    public Block(int block) {
        this.block = block;
    }

    private int getBlock() {
        return block;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Block // instanceof handles nulls
                && getBlock() == ((Block) other).getBlock());
    }

    /**TODO: override hashCode method properly*/

    @Override
    public String toString() {
        return block + "";
    }
}