package com.leetcode;

public class ValidPalindorme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ab2a";
		String o = s.replaceAll("[^A-Za-z0-1000]","").toLowerCase();
		//System.out.print(o);
		for(int i=0, j=o.length()-1; i<j; i++, j--){
			System.out.println(o.charAt(i));
            	System.out.println(o.charAt(j));
                if(o.charAt(i)!=o.charAt(j)) {
                    System.out.println("not equal");
                	break;
            }
        }
        //System.out.println(o);;

	}

}
