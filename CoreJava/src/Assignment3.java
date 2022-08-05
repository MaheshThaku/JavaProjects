class members
{
	protected String name;
	protected byte age;
	protected String mob;
	protected Address add;
	protected int sal;
	
	public members(Address add)
	{
		this.add=add;
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

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	void printSal()
	{
		System.out.println("Salary : "+sal);		
	}
}
class Employee extends members
{
	public Employee(Address add) {
		super(add);
	}

	private String specialization ;

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Employee [specialization=" + specialization + ", name=" + name + ", age=" + age + ", mob=" + mob
				+ ", address=" + add.city+","+add.pin + ", sal=" + sal + "]";
	}
	
	
	
}
class Manager extends members
{
	public Manager(Address add) {
		super(add);
	}

	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + ", name=" + name + ", age=" + age + ", mob=" + mob + ", address=" + add.city
				+","+add.pin+ ", sal=" + sal + "]";
	}

}
class Address
{
	String city;
	String pin;
	Address(String city,String pin)
	{
		this.city=city;
		this.pin=pin;
	}
}

class Ractangle
{
	short l,b;
	Ractangle(short l,short b)
	{
		this.l=l;
		this.b=b;
	}
	int aor()
	{
		return (l*b);
	}
	int por()
	{
		return 2*(l+b);
	}
}
class Square extends Ractangle
{
	short s;
	Square(short l, short b) {
		super(l, b);
		this.s=(short) (l*b);
	}
	short aos()
	{
		return (short) (s*s);
	}
	short pos()
	{
		return (short) (4*s);
	}
}
class Assignment3 {

	public static void main(String[] args) {
		Address add1 =new Address("palwal", "121102");
		Employee e1 = new Employee(add1);
		e1.setName("Mahesh Thakur");
		e1.setAge((byte)22);
		e1.setMob("9812085112");
		e1.setSal(200000);
		e1.setSpecialization("Software Developer");
		System.out.println("Question - 1 : \n"+e1);
		
		Address ma1 = new Address("Hathin","121102");
		Manager m1 = new Manager(ma1);
		m1.setName("Mohan Tanwer");
		m1.setAge((byte)28);
		m1.setMob("90532183..");
		m1.setSal(300000);
		m1.setDepartment("Finance");
		System.out.println(m1);
		
		Square s = new Square((short)2,(short)3);
		System.out.println("\nQuestion - 2 : \nArea of Ractangle : "+s.aor());
		System.out.println("Perimeter of Ractangle : "+s.por());
		System.out.println("Area of Square : "+s.aos());
		System.out.println("Area of Ractangle : "+s.pos());
	}
}
