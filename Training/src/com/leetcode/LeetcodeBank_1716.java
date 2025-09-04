package com.leetcode;

public class LeetcodeBank_1716 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int total =0;
		for(int i=1; i<=n; i++) {
			int weeks = i/7;
			int days = i%7;
			if(days == 0)	days = 6;
			total += days + weeks;
			System.out.println(total);
		}
		
	}

}
