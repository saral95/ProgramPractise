package org.sample;

public class SumOfDigits {
	public static void main(String[] args) {
		
		int i=9865;
		int rem=0;
		int res=0;
		
		while(i>0) {
			rem=i%10;
			res=res+rem;
			i=i/10;
		}
		System.out.println(res);
	}

}
