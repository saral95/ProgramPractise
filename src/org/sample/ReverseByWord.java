package org.sample;

public class ReverseByWord {
	public static void main(String[] args) {
		
		String name="Welcome to java class", result="";
		String[] sp = name.split(" ");
		for (int i = sp.length-1; i>=0; i--) {
			result=result+sp[i]+" ";
		}
		System.out.println(result);
	}

}
