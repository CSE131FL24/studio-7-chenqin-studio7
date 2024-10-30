package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
		
	}
	
	public double area(){
		return this.length * this.width;
	}	
	
	public double perimeter() {
		return 2*this.length + 2*this.width;
	}
	
	public boolean isSquare(){
		if (this.length == this.width) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isSmaller(Rectangle r2){
		if (this.length * this.width < r2.area()){
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3.0 , 3.0);
		Rectangle r2 = new Rectangle(1.0, 8.0);
		
		System.out.println(r1.area());
		System.out.println(r2.perimeter());
		
		System.out.println(r1.isSquare());
		System.out.println(r1.isSmaller(r2));
	}
}
