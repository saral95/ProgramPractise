package org.sample;

public class Palindrome {
	public static void main(String[] args) {
		
		int i=2992, rem=0, res=0;
		int n=i;
		
		while(i>0) {
			rem=i%10;
			res=(res*10)+rem;
			i=i/10;
			
		}
		if(n==res) {
			System.out.println(res + "palindrome");
		}
		
		else {
			System.out.println(res + "not a palindrome");
		}
	}

}
