//@author Mahesh Thakur
//2. Write a Java program to create a new tree set and add above ArrayLists in TreeSet.
//    Get the number of elements in  tree set and print first and last element of treeset.

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class BookTree{
	public static void main(String a[]) {
		
//		making list first of books
		List <Book> list1 = new ArrayList<Book>();
		list1.add(new Book(101,"Java","Calvin k"));
		list1.add(new Book(102,"C Programming","BalaguruSwami"));
		list1.add(new Book(103,"C++","BalaguruSwami"));
			
//		making list second of books
		List <Book> list2 = new ArrayList<Book>();
		list2.add(new Book(107,"HTML","Dr Rakesh"));
		list2.add(new Book(105,"JavaScript","Mahesh"));
		list2.add(new Book(108,"Python","Keelark"));
		
//		combining both list1 and list list2
		list2.addAll(list1);
		
//		adding list in TreeSet
		TreeSet <Book> ts = new TreeSet<>(list2);
		ts.addAll(list2);
		
//		operations
		System.out.println("size of set is :"+ts.size());		
		System.out.println("First Element : "+ts.first());
		System.out.println("Last Elements : "+ts.last());

	}
}
