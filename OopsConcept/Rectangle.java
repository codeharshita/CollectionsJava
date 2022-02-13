package OopsConcept;


class Rect{
	 public double length;
	 public double breadth;
	 
	 public double area() {
		 return length*breadth;
	 }
	 public double peri() {
		 return 2*(length + breadth); 
	 }
	
	
}



public class Rectangle {

	public static void main(String[] args) {
		Rect r = new Rect();
		
		r.length=34;
		r.breadth=98.4;
		
		System.out.println("The area is"+" "+ r.area());
		System.out.println("The perimeter is"+" "+ r.peri());
	}

}
