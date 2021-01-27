package org.sample;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class EnumerationTask {
	
	public static void main(String[] args) {
		
		
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(50);
		v.add(30);
		v.add(40);
		
		//Iterator<Integer> iterator = v.iterator(); 
		Enumeration<Integer> e = v.elements();
		
		while (e.hasMoreElements()) {
			Integer i = e.nextElement();
			System.out.println(i);
		}
		
		
	}

}
