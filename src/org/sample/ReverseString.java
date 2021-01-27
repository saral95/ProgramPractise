package org.sample;

public class ReverseString {
	public static void main(String[] args) {
		
		String name="Sara", res="";
		
		for (int i = name.length()-1; i>=0; i--) {
			char ca = name.charAt(i);
			res=res+ca;
			
		}
		System.out.println(res);
	}

}
