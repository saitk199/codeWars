package test;

import Examples.MinimumRoundsCompleteAllTasks;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MinimumRoundsCompleteAllTasksTest {

    @Test
    public void testBasic() {
        assertEquals (4, MinimumRoundsCompleteAllTasks.minimumRounds(new int[] {2,2,3,3,2,4,4,4,4,4}));
    }
}
