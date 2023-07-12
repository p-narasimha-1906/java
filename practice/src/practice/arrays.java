package practice;

import java.util.Arrays;

public class arrays {
	public static void main(String[] args) {
		String s="narasimhan";
		String v="aeiou";
	for(int i=0;i<s.length();i++)
	{
		if(v.contains(Character.toString(s.charAt(i))))
		{
			System.out.print(s.charAt(i));
		}
	}
		
		
	}
		
}
