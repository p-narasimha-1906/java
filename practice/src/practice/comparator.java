package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator{
	public static void main(String[] args) {
		String s="hello how are you";
		List<Integer> l=Arrays.asList(1,2,4,2,9,7);
		int k=l.stream().sorted().reduce(0, ((a,b)->a+b));
		System.out.println(k);
//		Collections.reverse(l);
//		l.stream().map(i -> new StringBuffer(i).reverse()).forEach( k -> System.out.print(k+" "));
//		
		
		
		
		
		
	}

	

}
