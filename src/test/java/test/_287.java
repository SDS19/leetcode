package test;

import java.util.HashMap;
import java.util.Map;
/**  */
public class _287 {
    /** runtime: 116 ms 5.16%
     *  memory usage: 125.6 MB 5.03% */
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0)+1);
        for (int num : nums)
            if (map.get(num) > 1) return num;
        return 100001;
    }
}
