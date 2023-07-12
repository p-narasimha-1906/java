package practice;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class stringbuffer {
	public static void main(String[] args) {
		HashSet s=new HashSet<>();
		Hashtable<Integer,Character> m=new Hashtable<>();
		m.put(1, 'a');
		Vector v=new Vector<>();
		s.add(1);
		s.add(11);
		s.add(12);
		s.add(13);
		s.add(15);
		s.add(11);
		System.err.println(s);
		Enumeration a=m.elements();
		while(a.hasMoreElements())
		{
			System.out.println(a.nextElement());
		}
}
}
