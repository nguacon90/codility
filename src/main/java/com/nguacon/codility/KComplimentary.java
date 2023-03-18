package com.nguacon.codility;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the k-complimentary pairs of an Array A.
 * A[P] + A[Q] = k
 *
 * A[0] = 1;
 * A[1] = 8;
 * A[2] = -3;
 * A[3] = 0;
 * A[4] = 1;
 * A[5] = 3;
 * A[6] = -2;
 * A[7] = 4;
 * A[8] = 5;
 *
 * k = 6 would yield a return value of 7.
 *
 * (0,8)(1,6)(4,8)(5,5)(6,1),(8,0)(8,4)
 */
public class KComplimentary {
    public int solution(int K, int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int item: A) {
            if(map.containsKey(item)) {
                map.put(item, (map.get(item) + 1));
            } else {
                map.put(item, 1);
            }
        }
        int count = 0;
        for(int item: A) {
            int temp = K - item;
            if(map.containsKey(temp)) {
                count += map.get(temp);
            }
        }
        return count;
    }
}
