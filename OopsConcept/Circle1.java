package OopsConcept;

class Circle{
	
	public double radius;
	
	public double area() {
		return Math.PI*radius*radius;
		
	}
	public double peri() {
		return 2*Math.PI*radius;
		
	}
	
	
}

class Fan{
	
	public String Name;
	public int wings;
	
	public  void switchOn() {
  System.out.println("The fan is on");
	}	
	
	public  void switchOff() {
		System.out.println("The fan is off!");
	}
	
	
}

public class Circle1 {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Circle c2= new Circle();
		
		
		c2.radius=9;
		c1.radius=7.7;		
		System.out.println(c1.area());
		System.out.println(c1.peri());

		
		System.out.println("********************");
		System.out.println("Area of circle is "+c2.area());
		System.out.println("Perimeter of circle is "+c2.peri());
		
		
		Fan f1= new Fan();
		Fan f2 = new Fan();
		
		f1.switchOn();
		f1.switchOff();
		
		
	}

}
