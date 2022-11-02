package studio7;

public class Rectangle {
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double getLength() {return this.length;} //returns the length
	public double getWidth() {return this.width;} //returns the width
	public double area(){
		double area = getLength() * getWidth();
		return area;
	}
	public double perimeter(){
		double perimeter = 2* (getLength() + getWidth());
		return perimeter;
	}
	public boolean compareArea(Rectangle rectangle2){
		if (area() > rectangle2.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean square() {
		if(getLength() == getWidth()){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle k = new Rectangle(5.0,5.0);
		System.out.println(k.area());
		Rectangle j = new Rectangle(9.7,8.3);
		System.out.println(j.area());
		System.out.println(k.compareArea(j));
		System.out.println(k.square());
	}

}
