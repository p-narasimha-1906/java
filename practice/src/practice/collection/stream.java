package practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import practice.map;

class Employee
{
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;
	Employee(int id,String name,int age,String gender,String department,int yearOfJoining,double salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.department=department;
		this.yearOfJoining=yearOfJoining;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	

}
public class stream {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
		
		
//		Map<String,Long> m=   employeeList.stream().collect(Collectors.groupingBy(i -> i.gender,Collectors.counting()));
//		System.out.println(m);
//		employeeList.stream().map(i -> i.department).distinct().forEach(System.out::println);
//	Map<String,Double> m1=	employeeList.stream().collect(Collectors.groupingBy(i -> i.gender,Collectors.averagingDouble(j -> j.age)));
//	System.out.println(m1);
		
		
		
//		Optional<Employee> o= employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(i -> i.salary)));
//		System.out.println(o);
		
		
		
//		Map<String,Long> m3=employeeList.stream().collect(Collectors.groupingBy(i -> i.department,Collectors.counting()));
//		System.out.println(m3);
		
//		Map<String,Double> m3=employeeList.stream().collect(Collectors.groupingBy(i -> i.department,Collectors.averagingDouble(i -> i.salary)));
//		System.out.println(m3);
//		
		
//	Optional<Employee> o=	employeeList.stream().filter(i -> i.department.equals("Development") && i.gender.equals("Male")).collect(Collectors.minBy(Comparator.comparing(k -> k.age)));
//		
//		System.out.println(o);
		
		
		
		
		
//		Optional<Employee> o=employeeList.stream().collect(Collectors.minBy(Comparator.comparing(i -> i.yearOfJoining)));
//		System.out.println(o);
		
		
//		Map<String,List<Employee>> n= employeeList.stream().collect(Collectors.groupingBy(i -> i.department));
//		System.out.println(n);
		
//		  double d=employeeList.stream().collect(Collectors.averagingDouble(k -> k.salary));
//		  System.out.println(d);
//		  
//		  
//		  double p=  employeeList.stream().mapToDouble(i ->i.salary).sum();
//		  System.out.println(p);
//		 
//		 
//		  
//		  
//		  int[] g= {1,2,3};
//		int re= Arrays.stream(g).reduce(0, (a,b) -> a+b);
//		System.out.println(re);
		
		
		
//		Map<Boolean,List<Employee>> m=employeeList.stream().collect(Collectors.partitioningBy(i ->i.age<=25));
//		System.out.println(m);
		
		
//		employeeList.stream().mapToDouble(i -> i.salary).boxed().sorted(Comparator.reverseOrder()).skip(1).forEach(i -> System.out.println(i));
		
		
		
		CopyOnWriteArrayList<Integer> l=new CopyOnWriteArrayList<>();
		
		l.add(10);
		l.add(101);
		l.add(20);
		l.add(20);
		l.add(30);
		l.add(1);
		
		
		for (int i:l)
		{
			System.out.println(i);
			l.add(0);
		}
		System.out.println(l);
		
		
		}

}
