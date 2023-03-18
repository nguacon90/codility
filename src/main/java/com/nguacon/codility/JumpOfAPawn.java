package com.nguacon.codility;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array A, with dimension N, 1<=N<=100000,
 * A[N] within range of [-100000, 100000].
 * At first there is a pointer at position K (in the beginning K=0), and M=A[K],
 * and we say the pointer will jump to position A[K+M], and call this a "jump of a pawn`.
 * If at any moment, the pointer jumps out of the array,
 * we must return the steps of jumps it takes. If it will never jump out, return -1.
 */
public class JumpOfAPawn {
    public int solution(int[] A) {
        int next = A[0];
        int N = A.length;
        Map<Integer, Integer> visitedNode = new HashMap<>();
        for (int i=0; i<N; i++) {
            visitedNode.put(i, 0);
        }

        visitedNode.put(0, 1);
        int countStep = 0;
        while (next < N && next >= 0) {
            countStep ++;
            next = A[next] + next;
            if (next >= N || next < 0) {
                return countStep+1;
            }
            visitedNode.put(next, visitedNode.get(next) + 1);
            if (visitedNode.get(next) > 1) {
                return -1;
            } else {
                continue;
            }

        }
        return countStep + 1;
    }
}
