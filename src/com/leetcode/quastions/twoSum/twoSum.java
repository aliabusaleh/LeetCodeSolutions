package com.leetcode.quastions.twoSum;

import java.util.HashMap;

public class twoSum {

    //time complexity o(n), enjoy it !

    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2] ;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i < nums.length -1;i++){
            if(map.get((target- nums[i])) == null){
                map.put((target-nums[i]),i);
            }
            else{
                arr[0] = map.get((target- nums[i]));
                arr[1] = i;
            }
        }
        return arr;

    }
}
