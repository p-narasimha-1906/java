package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class employee {
	public static void main(String[] args) {
		List<hello> l =new ArrayList<>();
		l.add(new hello("raj",3));
		l.add(new hello("ram",1));
		l.add(new hello("raj",8));
		l.add(new hello("bj",2));
		l.add(new hello("aj",0));
Collections.sort(l,new IdBased());
		Collections.reverse(l);
		for(hello h:l)
		{
			System.out.println(h);
		}
	}

}
class hello
{
	String name;
	int id;
	hello(String name,int id)
	{
		this.name=name;
		this.id=id;
	}

	

	@Override
	public String toString() {
		return "hello [name=" + name + ", id=" + id + "]";
	}
	
}

class IdBased implements Comparator<hello>
{

	@Override
	public int compare(hello o1, hello o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

	

	
	
}