package OopsConcept;

class Cylinder1{
	 
	public double radius;
	public double height;
	
	public double lidArea() {
		
		return Math.PI* radius *radius;
	}
	 public double circumference() {
		  
		 return 2*Math.PI*radius;
	 }
	 public double surfaceArea() {
		 return 2*lidArea()+circumference()*radius;
	 }
}



public class Cylinder {

	public static void main(String[] args) {
		Cylinder1 c1= new Cylinder1();

		c1.radius=9;
		c1.height=7;
		
		System.out.println("LIDAREA IS: " + c1.lidArea() );
		System.out.println("circumference: "+ c1.circumference());
		System.out.println("Surfacearea: " + c1.surfaceArea());
		
		
		

	}

}
