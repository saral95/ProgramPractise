package org.sample;

public class ReverseString1 {
	public static void main(String[] args) {

		String name = "Welcome to java class", result = "";
		String[] sp = name.split(" ");
		for (String wd : sp) {
			String rev = "";

			for (int i = wd.length() - 1; i >= 0; i--) {
				
					rev = rev + wd.charAt(i);
				
			}
			result=result+" "+rev;						
			}
		
		System.out.println(result);
	}

}
