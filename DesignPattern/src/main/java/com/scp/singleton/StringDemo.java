package com.scp.singleton;

import java.util.Iterator;
import java.util.TreeSet;

public class StringDemo {

	public static void main(String[] args) {
		/*TreeSet s1=new TreeSet<>();
		s1.add("One");
		s1.add("Two");
		s1.add("Three");
		s1.add("One");
		Iterator itr= s1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()+"");
		}*/
		
		String s1 ="JAVA";
		String s2 ="JAVA";
		String s3 = new String("JAVA");
		String s4 = s3;
		String s5 = new String("Programming");
		System.out.println(s5.intern());
		//System.out.println(s4==s3);

	}

}
