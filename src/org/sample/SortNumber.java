package org.sample;

public class SortNumber {
	public static void main(String[] args) {
		
		int[] a= {2, 9, 5, 1, 6, 8};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i]; 
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
			}
		System.out.println("After sorted in ascending order:");
		for (int x : a) {
			System.out.print(x);
		}
	}

}
