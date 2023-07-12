package in.inheritence;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

interface employee1
{
	default void m1()
	{
		System.out.println("from employee1");
	}
}
interface employee2
{
	default void m1()
	{
		System.out.println("from employee2");
	}
}

public class multiple{
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		s.add(3);
		s.add(9);
		s.add(18);
		s.add(80);
		s.add(6);
		s.add(1);
		s.add(98);
		s.add(3);
		System.out.println(s);
		
}
}