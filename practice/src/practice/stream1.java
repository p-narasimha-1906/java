package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream1 {
	public static void main(String[] args) {
		
		
		person p=new person("ram", 20, "emp");
		person p1=new person("kani", 27, "teacher");
		person p2=new person("mani", 90, "software");
		person p3=new person("kesav", 90, "software");
		List<person> s=Arrays.asList(p,p1,p2,p3);
		
		double a=s.stream().collect(Collectors.averagingInt(emp -> emp.getAge()));	
		System.out.println(a);
		

		Optional<person> m=s.stream().collect(Collectors.minBy(Comparator.comparing(emp -> emp.getAge())));	
		System.out.println(m.get().getAge());

		Optional<person> max=s.stream().collect(Collectors.maxBy(Comparator.comparing(person::getAge)));
		System.out.println(max.get().getAge());
		
		
	Map<String,List<person>> group=s.stream().collect(Collectors.groupingBy(person::getJob));
		System.out.println(group);
		
		
		/*List<String> java=Arrays.asList("cor java","adva java","spring","sql","ram","uuu");
		
		List<String> python=Arrays.asList("cor python","deth python","jango","sql");
		List<List<String>> course=Arrays.asList(java,python);
		course.stream().flatMap(y -> y.stream()).distinct().filter(o -> o.length()==3).forEach(System.out::println);
	*/
	}

}
