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
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", Institute Name="+instituteNames +"]";
	}
	public Student(int rollno, String name, byte age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}


}
public class sss {
	public static void main()
	{
		Student s1 = new Student(1,"Mahesh Thakur",(byte) 22);
		Student s2 = new Student(2,"Mohan Thakur",(byte) 20);
		Student s3 = new Student(3,"Rahul Tanwer",(byte) 18);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
