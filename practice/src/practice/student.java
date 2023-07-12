package practice;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class student implements Comparable<student> {
	public int id;
	public int age;
	public String name;
	student(int id,int age,String name)
	{
		this.id=id;
		this.age=age;
		this.name=name;
	}
	@Override
	public int compareTo(student o) {
		
		return this.age-o.age;
	}
	
	@Override
	public String toString() {
		return "student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		List<student> s=new ArrayList<>();
		s.add(new student(10,20,"ram"));
		s.add(new student(11,2,"mani"));
		s.add(new student(15,23,"bhaskar"));
		s.add(new student(1,30,"parthu"));
	s.forEach(i -> System.out.println(i.toString()));
	System.out.println("after sorting");
		Collections.sort(s);
		s.forEach(i -> System.out.println(i.toString()));
	}
	

}
