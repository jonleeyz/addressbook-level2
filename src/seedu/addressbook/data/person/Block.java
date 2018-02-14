package seedu.addressbook.data.person;

public class Block {
    private final int block;

    public Block(int block) {
        this.block = block;
    }

<<<<<<< Updated upstream
=======
    private int getBlock() {
        return block;
    }

>>>>>>> Stashed changes
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Block // instanceof handles nulls
<<<<<<< Updated upstream
                && this.block == other.block);

=======
                && getBlock() == ((Block) other).getBlock());
>>>>>>> Stashed changes
    }

    /**TODO: override hashCode method properly*/

    @Override
    public String toString() {
<<<<<<< Updated upstream
        return block;
=======
        return block + "";
>>>>>>> Stashed changes
    }
}