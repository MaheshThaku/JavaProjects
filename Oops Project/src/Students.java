//@ Mahesh Thakur
class Student{
	static final String instituteNames = "Hartron Skill Center";

	private int rollno;
	private String name;
	private byte age;

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
//	@Override - toString method for printing values of object
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", Institute Name="+instituteNames +"]";
	}
//	perameterised constructor
	public Student(int rollno, String name, byte age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
//	default constructor 
	public Student() {
		super();
	}


}
public class Students {
	public static void main()
	{
//		initilizing three objects of Student class
		Student s1 = new Student(1,"Mahesh Thakur",(byte) 22);
		Student s2 = new Student(2,"Mohan Thakur",(byte) 20);
		Student s3 = new Student(3,"Rahul Tanwer",(byte) 18);
		
//		printing values of Student objects
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
