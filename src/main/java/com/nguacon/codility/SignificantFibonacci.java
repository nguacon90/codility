package com.nguacon.codility;

import java.math.BigInteger;

/**
 * fibonacci with n significant
 */
public class SignificantFibonacci {

    public int solution(int N) {
        BigInteger[] a = new BigInteger[N+1];
        a[0] = new BigInteger("0");
        a[1] = new BigInteger("1");
        for(int i = 2; i<=N; i++) {
            a[i] = a[i-1].add(a[i-2]);
        }
        String bigStr = a[N].toString();
        if(bigStr.length() > 6) {
            bigStr = bigStr.substring(bigStr.length() - 6);
        }
        return Integer.valueOf(bigStr);
    }
}
