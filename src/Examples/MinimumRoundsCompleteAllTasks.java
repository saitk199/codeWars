package Examples;

import java.util.*;

public class MinimumRoundsCompleteAllTasks {
    public static int minimumRounds(int[] tasks) {
        int minimumRounds = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer task : tasks) {
            if (map.containsKey(task)) {
                Integer count = map.get(task);
                map.put(task, count + 1);
            } else map.put(task, 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer count = entry.getValue();
            if (count == 1) {
                return -1;
            }
            while (count != 0) {
                minimumRounds++;
                if (count == 4 || count == 2) {
                    count -= 2;
                } else count -= 3;
            }
        }
        return minimumRounds;
    }
}
