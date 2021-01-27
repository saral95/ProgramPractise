package org.sample;

public class CountodOddEven {
	public static void main(String[] args) {
		
		int count =0, count1=0;
		for (int i = 0; i <=10; i++) {
			if(i%2==0) {
				count++;
			}
			
			else {
				count1++;
			}
			
		}
		System.out.println(count);
		System.out.println(count1);
	}

}
