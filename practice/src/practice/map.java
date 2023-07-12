package practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class map {
	public static void main(String[] args) {
		String s = "abcdABCDabcd";
		StringBuffer s1 = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				s1.append(Character.toLowerCase(s.charAt(i)));
			}
			else
			{
				s1.append(Character.toUpperCase(s.charAt(i)));	
			}

		}
		System.out.println(s+"    "+s1);
		s1.insert(1, "123");
		System.out.println(s1);
		Set<String> set=new HashSet();
		set.add("a");
		set.add("a");
		set.add("h");
		System.out.println("set is "+set);
		String s3=String.join("", set);
		System.out.println(s3);
		

	}

}
