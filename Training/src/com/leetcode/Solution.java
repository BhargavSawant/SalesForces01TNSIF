package com.leetcode;

public class Solution{
    public static void main(String[] args){
    	int[] nums= {1,3,5,6};
    	int target=7;
    	int result = searchInsert(nums, target);
    	System.out.println(result);
    	}
        
    public static int searchInsert(int[] nums, int target) {
    		int start = 0;
        int end = nums.length-1;
        int mid = (start+(end-start))/2;
        while(start<=end){
            if(target == mid)
                return mid;
            else if(target > mid)
                return start = mid+1; 
            else if(target < mid)
                return end = mid-1;
            else{
                target = target - 1;    
                seacrhInsert(nums, target);
            }
        }
        return 1;
    }
    }
}
