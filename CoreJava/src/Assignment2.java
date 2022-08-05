// Author Mahesh Thakur
class FunctionOverloading {
//	area of ractangle
	int area(int l,int b) {
		return l*b;
	}
	
//	area of square
	int area(int s) {
		return s*s;
	}
	
}

class Student
{
	private String name;
	private byte age;
	private String add;
	private static byte c=1;
	
//	constructor for intilize data members
	Student()
	{
		name="";
		age=0;
		add="not available";
	}
	
//	configure a method with two parameter
	void setInfo(String name,byte age)
	{
		this.name=name;
		this.age=age;
	}
	
//	configure a method with three parameter
	void setInfo(String name,byte age,String add)
	{
		this.name=name;
		this.age=age;
		this.add=add;
	}
//	void disp()
//	{
//		System.out.println("Name : "+name+"\nage : "+age+"\nAddress : "+add);
//	}
	@Override
	public String toString() {
		return "Student "+(c++)+" : [name=" + name + ", age=" + age + ", add=" + add + "]";
	}
	
}

class Assignment2{
	public static void main(String[] args) {
		
//		creating instance of class FunctionOverloading
		FunctionOverloading obj = new FunctionOverloading();
		
//		calling methods of FunctionOverloading class
		System.out.println("Area of ractangle is : "+obj.area(2,3));
		System.out.println("Area of square is : "+obj.area(2));
		
//		creating array of instance of class Students
		Student st[] = new Student[5];

		st[0] = new Student();
		st[0].setInfo("mahesh", (byte) 20, "VPO-Hathin");
		System.out.println(st[0]);
		
		st[1]=new Student();
		st[1].setInfo("Mohan", (byte) 24, "VPO-Faridabad");
		System.out.println(st[1]);
		
		st[2]=new Student();
		st[2].setInfo("Aaru", (byte) 23);
		System.out.println(st[2]);

	}

}
