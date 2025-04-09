/* Write a program to create a class Rectangle with datamembers length and breadth. 
Create a method area() which finds the area of the rectangle. Use constructors to assign 
values to datamembers */

class RectangleOne {
	int length;
	int breadth;
	int area;
	RectangleOne(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
		this.area = calculatedArea();
	}
	
	int calculatedArea() {
		return length*breadth;
	}
	
	
	void display() {
		System.out.println("Area of Rectangle: " + area);
	}
}
public class RectangleConstructor {

	public static void main(String[] args) {
		RectangleOne r1 = new RectangleOne(50,69);
		r1.display();
	}

}
