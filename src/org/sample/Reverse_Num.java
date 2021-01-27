package org.sample;

public class Reverse_Num {
	
	public static void main(String[] args) {
		int num=456; String result="";
		//convert to string
		//String a = Integer.toString(num); (or)
		String a = String.valueOf(num);
		for(int i=a.length()-1; i>=0; i--) {
			char c = a.charAt(i);
			result=result+c;
			//System.out.print(a.charAt(i));
		}
		System.out.println(result);
	//int le = result.length();
	//System.out.println(le);

	//convert string to int
	    int no = Integer.parseInt(result);
	    System.out.println(no);
}
}