package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

class person1 implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2)
		{
			return 1;
		}
		else if(o1<o2)
		{
			return -1;
		}
		return 0;
	}

	
	}
	

public class function {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(5);
		a.add(1);
		a.add(9);
		a.add(4);
//		Collections.sort(a,new person1());
		Collections.sort(a, (i,j)->(i>j)?-1:1);
		Collections.sort(a,(i,j)->(j.compareTo(i)));
		System.out.println(a);
		System.out.println(a.getClass().getName());
		
	}
	}



