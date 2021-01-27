package org.sample;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorTask {
	public static void main(String[] args) {

		Vector<Integer> l = new Vector<>();
		l.add(30);
		l.add(40);
		l.add(60);
		l.add(70);

		ListIterator<Integer> li = l.listIterator();
		System.out.println("Forward direction");

		while (li.hasNext()) {
			Integer i = li.next();
			if (i == 60) {
				li.remove();
			}
			System.out.println(i);

		}
		System.out.println("Backward direction");

		while (li.hasPrevious()) {
			Integer i =  li.previous();
			
			System.out.println(i);
		}
	}
	

}
