package practice.collection;

import java.util.ArrayList;

public class foreachmethod {
	public static void main(String[] args) {
		
	
	ArrayList<Integer> a=new ArrayList<>();
	a.add(5);
	a.add(6);
	
	a.add(7);
	a.forEach(System.out::println);
	
	}

}
