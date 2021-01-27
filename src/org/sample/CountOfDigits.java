package org.sample;

public class CountOfDigits {
	public static void main(String[] args) {
		int num=123456, count=0;
		
		while(num>0) {
			count++;
			num=num/10;
		}
		System.out.println(count);
	}

}
