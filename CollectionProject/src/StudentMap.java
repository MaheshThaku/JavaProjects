//@author Mahesh Thakur
//3. WAP to create a HashMap and add 5 student's id(101,102,103,104,105) as key and name as value.
//   Print the name of students whose id is greater than 103.
import java.util.HashMap;
import java.util.Map;

public class StudentMap{
	public static void main(String ar[])
	{
//		making HashMap
		Map <Integer,String> stu = new HashMap<Integer,String>();
		
//		adding data
		stu.put(101, "mahesh Thakur");
		stu.put(102, "Mohan Thakur");
		stu.put(103, "Rahul Tanwer");
		stu.put(104, "Archit Pandey");
		stu.put(105, "Rakesh Singh");
		
//		Printing names of students whose id is greater than 103 with lambda expression.
		 stu.forEach((k, v) -> 
		 {
			 if(k>103)
			 System.out.println(k + " : "+ v);
		 });
                                       
	}
}
