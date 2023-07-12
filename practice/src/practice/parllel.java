package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public abstract class parllel {
	public static void main(String[] args) {
		System.out.println("serial");
		Stream<Integer> i=Stream.of(1,2,3,4,5);
		i.forEach(k -> System.out.println(k+"========"+Thread.currentThread().getName()+"kya"));
		System.err.println("parllel");
		Stream<Integer> o=Stream.of(1,2,3,4,5,6,7,8,9);
		o.parallel().forEach(k -> System.out.println(k+"========"+Thread.currentThread().getName()));
		
		List<String> split= new ArrayList<>();
		split.add("narasimha");
		split.add("parthasaradhi");
		split.add("bhasker");
		Spliterator<String> s= split.spliterator();
		s.forEachRemaining(System.out::println);
		
		
		
		}

}
