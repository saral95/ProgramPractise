package org.sample;

public class ReverseNumber_int {
	public static void main(String[] args) {
		
		int n=5678543, rem=0, res=0;
		
		while(n>0) {
			rem=n%10;
			res=(res*10)+rem;
			n=n/10;
			
		}
		System.out.println(res);
		
	}

}
