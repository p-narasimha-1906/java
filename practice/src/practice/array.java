package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		List<Integer> l1=new ArrayList<>();
		l1.add(1);
		l1.add(2);
		//l1.add(3);
		
		System.out.println(l.equals(l1));
		
		int[] a= {1,2};
		int[] b= {1,2};
		System.out.println(Arrays.equals(a, b));
	}
}
