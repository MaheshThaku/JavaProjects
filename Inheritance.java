class Shape
{
	void print()
	{
		System.out.println("This is Shape");
	}
}
class Rectangle extends Shape
{
	void print()
	{
		System.out.println("This is Rectangle Shape");
	}
}
class Circle extends Shape
{
	void print()
	{
		System.out.println("This is Circular Shape");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Shape sh = new Shape();
		sh.print();
		
		Rectangle r = new Rectangle();
		r.print();

	}

}
