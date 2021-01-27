package org.sample;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set; 


public class Mapp {
	public static void main(String[] args) {
		
		UserDefined u1=new UserDefined();
		u1.setEmpId(123);
		u1.setName("Sara");
		u1.setPhNum(7639678976l);
		
		UserDefined u2=new UserDefined();
		u2.setEmpId(345);
		u2.setName("Priya");
		u2.setPhNum(9089764356l);
		
//		List<UserDefined> l=new ArrayList<>();
//		l.add(u); l.add(u1);
//		
//      for(int i=0; i<l.size(); i++) {
//  		System.out.println(l.get(i).getEmpId());
//  		System.out.println(l.get(i).getName());
//  		System.out.println(l.get(i).getPhNum());
		
		
		Set<UserDefined> s=new LinkedHashSet<>();
		s.add(u1); s.add(u2);
		for (UserDefined u : s) {
			System.out.println(u.getEmpId());
			System.out.println(u.getName());
			System.out.println(u.getPhNum());
			
		}
//		Map<Integer,UserDefined> m = new LinkedHashMap<Integer,UserDefined>();
//		m.put(1, u1);
//		m.put(2, u2);
//		
//		Set<Entry<Integer, UserDefined>> e = m.entrySet();
//		for (Entry<Integer, UserDefined> ex : e) {
//			System.out.println(ex.getValue().getEmpId());
//			System.out.println(ex.getValue().getName());
//			System.out.println(ex.getValue().getPhNum());

			
		}
		
		
	}


