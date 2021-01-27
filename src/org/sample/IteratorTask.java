package org.sample;

import java.util.Iterator;
import java.util.Vector;

public class IteratorTask {
	public static void main(String[] args) {
		
		Vector<Integer> l=new Vector<>();
		l.add(30);
		l.add(40);
		l.add(60);
		l.add(70);
		
        Iterator<Integer> i = l.iterator();
        //l.remove(1);
            while (i.hasNext()) {
				Integer a = i.next();
              if(a==30) {
            	  i.remove();
              }
              System.out.println(a);
			}
          System.out.println("After removing element:");
          for (Integer in : l) {
			System.out.println(in);
		}
	}

}
