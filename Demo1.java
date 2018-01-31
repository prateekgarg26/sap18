package com.sapient.demos;

import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Emp> lst = new ArrayList<>();
		
		lst.add(new Emp(1007,"ram",67000));
		lst.add(new Emp(1003,"tom",57000));
		lst.add(new Emp(1001,"amar",87000));
		lst.add(new Emp(1009,"peter",47000));
		lst.add(new Emp(1006,"ravi",77000));
		for(Emp x : lst){
			System.out.println(x);
		}
		Collections.sort(lst);
		System.out.println();
 		
		System.out.println("---------comparable------sort by id------");
		
		for(Emp x : lst){
			System.out.println(x);
		}
		Collections.sort(lst, new NameComparator());	
		System.out.println();

		System.out.println("---------comparator------sort by name------");

		for(Emp x : lst){
			System.out.println(x);
		}
		Collections.sort(lst, new salComparator());	
		System.out.println();
		System.out.println("---------comparator------sort by sal------");
		for(Emp x : lst){
			System.out.println(x);
		}
		

		

	}

}
