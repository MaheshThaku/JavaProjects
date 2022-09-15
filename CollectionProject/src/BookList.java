//@author MaheshThakur
//1.WAP to create 2 ArrayLists list1 and list2 and add 3 objects of Book in each list
// and print elements of both ArrayLists one on one line.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {
	public static void main(String ar[])
	{
//		making list first of books
		List <Book> list1 = new ArrayList<Book>();
		list1.add(new Book(101,"Java","Calvin k"));
		list1.add(new Book(102,"C Programming","BalaguruSwami"));
		list1.add(new Book(103,"C++","BalaguruSwami"));
	
//		iterating list1 using for each loop with lambda exp.
		list1.forEach(
	            (t) -> { System.out.println(t); });

//		making list second of books
		List <Book> list2 = new ArrayList<Book>();
		list2.add(new Book(101,"HTML","Dr Rakesh"));
		list2.add(new Book(102,"JavaScript","Mahesh"));
		list2.add(new Book(103,"Python","Keelark"));
		
//		making object of Iterator
		Iterator<Book> ls = list2.iterator();
	
//		iterating list1 using Iterator
		while(ls.hasNext())
			System.out.println(ls.next());
	}
}
