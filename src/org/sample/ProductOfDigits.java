package org.sample;

public class ProductOfDigits {
	public static void main(String[] args) {
		
		int n=145, rem=0, res=1;
		
		while(n>0) {
			rem=n%10;
			res=res*rem;
			n=n/10;
		}
		System.out.println(res);
	}

}
