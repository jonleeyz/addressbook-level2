package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UtilsTest {


    @Test
    public void elementsAreUnique() throws Exception {
        // empty list
        assertAreUnique();

        // only one object
        assertAreUnique((Object) null);
        assertAreUnique(1);
        assertAreUnique("");
        assertAreUnique("abc");

        // all objects unique
        assertAreUnique("abc", "ab", "a");
        assertAreUnique(1, 2);

        // some identical objects
        assertNotUnique("abc", "abc");
        assertNotUnique("abc", "", "abc", "ABC");
        assertNotUnique("", "abc", "a", "abc");
        assertNotUnique(1, new Integer(1));
        assertNotUnique(null, 1, new Integer(1));
        assertNotUnique(null, null);
        assertNotUnique(null, "a", "b", null);
    }

    @Test
    public void isAnyNull() throws Exception {
        // empty list
        assertNoneNull();

        // only one object
        assertAnyNull(null);
        assertNoneNull(1);
        assertNoneNull("");
        assertNoneNull("abc");

        // some nulls out of multiple objects
        assertAnyNull(null, "abc", "abc");
        assertAnyNull(null, "", "abc");
        assertAnyNull(null, 1, "abc");
        assertAnyNull(null, null, "abc");

        // all nulls out of multiple objects
        assertAnyNull(null, null);
        assertAnyNull(null, null, null);
        assertAnyNull(null, null, null, null, null, null, null, null, null, null);

        // empty arrays
        assertNoneNull(new String[5], new String[5]);
        assertNoneNull(new String[5], new String[5], new String[5], new String[5]);

        // non-empty arrays
        String[] testArrayOne = {"abc", "", "hello"};
        String[] testArrayTwo = {"bbc", "poll", "ravi"};
        String[] testArrayThree = {"ty", "gg", "wp", null};
        assertNoneNull(testArrayOne, testArrayTwo);
        assertNoneNull(testArrayOne, testArrayTwo, testArrayThree);
        assertAnyNull(testArrayOne, testArrayTwo, null);

        // empty Collections
        assertNoneNull(new ArrayList<>());
        assertNoneNull(new LinkedList<>());
        assertNoneNull(new ArrayList<>(), new LinkedList<>());
        assertNoneNull(new HashMap<>());
        ArrayList<String> testListOne = new ArrayList<>();
        ArrayList<String> testListTwo = new ArrayList<>();

        // non-empty Collections
        testListOne.add("bbc");
        testListOne.add("balaku");
        testListOne.add("123");
        testListTwo.add("4567");
        testListTwo.add("ggwp");
        testListTwo.add(null);
        assertNoneNull(testListOne);
        assertNoneNull(testListTwo);
        assertNoneNull(testListOne, testListTwo);
    }

    private void assertAnyNull(Object... objects) {
        assertTrue(Utils.isAnyNull(Arrays.asList(objects)));
    }

    private void assertNoneNull(Object... objects) {
        assertFalse(Utils.isAnyNull(Arrays.asList(objects)));
    }

    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }
}
