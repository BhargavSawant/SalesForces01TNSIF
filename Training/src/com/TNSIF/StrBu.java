package com.TNSIF;

public class StrBu {
	
	public static void main (String[] args) {
		
		StringBuilder sb = new StringBuilder("tony");
		System.out.println(sb);
		
		
//		sb.setCharAt(0, 'T');
//		System.out.println(sb);
//		
//		//sb.insert(0, "Stark ");
//		sb.delete(2, 3);
//		System.out.println(sb);
//		sb.append(" Stark");
//		System.out.println(sb);
		
		for(int i=0; i<=sb.length()/2; i++){
			int f = i;
			int b = sb.length()-1-i;
			
			char fchar = sb.charAt(f);
			char bchar = sb.charAt(b);
			
			sb.setCharAt(f, bchar);
			sb.setCharAt(b, fchar);
			
			
		}
		System.out.println(sb);
	}

}
