//@ Mahesh Thakur
interface Shape{
	int area();
}
class Square implements Shape{
	int length;
//	@Override = area() method 
	public int area() {
		return length*length;
	}
	
}
class Rectangle extends Square{
	int width;
//	@Override = area() method 
	public int area() {
		return width*length;
	}
}
public class Main {

	public static void main(String[] args) {
//		making instance of Square for intilize data members
		Square sq = new Square();
		sq.length=4;
		System.out.println("Area of Square : "+sq.area());
		
//		making instance of Rectangle for intilize data members
		Rectangle rec = new Rectangle(); 
		rec.width=3;
		rec.length=3;
		System.out.println("Area of Rectangle : "+rec.area());
	}

}
