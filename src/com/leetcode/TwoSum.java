package com.leetcode;

import java.util.HashMap;

/**
 * Created by user on 27/11/16.
 */
public class TwoSum {
    public static void main(String []args) {
        int[] num = {3, 2, 4};
        int target = 6;
        int[] result = new int[2];

        result = twoSum(num, target);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] twoSum(int[] num, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            hm.put(num[i], i);
        }

        for (int i = 0; i < num.length; i++) {
            int temp = target - num[i];
            if (hm.get(temp) != null &&  hm.get(temp) != i) {
                result[0] = i;
                result[1] = hm.get(temp);
                break;
            }
        }

        return result;

    }
}
