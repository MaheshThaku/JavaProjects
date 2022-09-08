//@ Mahesh Thakur
public class Calculator {
//	overloaded add methods with different number of perameters
	static int add(int no1, int no2)
	{
		return no1+no2;
	}
	
	static double add(double n, int no1, int no2)
	{
		return n+no1+no2;
	}
	
	static String add(String s1, String s2)
	{
		return s1+s2;
	}
	
//	overloaded subtract method
	static int subtract(int a,int b)
	{
		return a-b;
	}
	static double subtract(double a,double b)
	{
		return a-b;
	}
	
	
	public static void main(String[] args) {
		
//		calling all overloaded mathods 
		System.out.println(add(2,4));
		
		System.out.println(add(23.4,2,4));
		
		System.out.println(add("jai ","singh"));
		
		System.out.println(subtract(2,4));
		
		System.out.println(subtract(14.3,2.5));
	}

}
