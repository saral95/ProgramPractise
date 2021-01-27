package org.sample;

public class ChangeFirstLetterCaps {
	public static void main(String[] args) {
		
		String name="welcome to java class", res="";
		String[] sp = name.split(" ");
		for (String s : sp) {
			char c = s.charAt(0);
			res=Character.toUpperCase(c)+s.substring(1)+" ";
			System.out.print(res);

		}
		
	}
	}
