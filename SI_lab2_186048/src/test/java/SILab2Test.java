import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private final SILab2 test = new SILab2();
    private List<String> createList(String... el){
        return new ArrayList<>(Arrays.asList(el));
    }

    @Test
    void everyStatementTest() {
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> test.function(createList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        List<String> list1 = createList("#", "0", "#");
        List<String> list2 = createList("#", "2", "#");
        assertTrue(test.function(list1).equals(list2));
    }

    @Test
    void everyBranchTest() {
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> test.function(createList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        List<String> list1 = createList("0", "#", "0");
        List<String> list2 = createList("1", "#", "1");
        assertTrue(test.function(list1).equals(list2));
    }


}