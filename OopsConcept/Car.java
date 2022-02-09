package OopsConcept;

public class Car {

  String name;
  int wheels;
	
	public static void main(String[] args) {
		
		
		
		Car obj = new Car();
		Car obj1 = new Car();
		Car obj2= new Car();
		
		obj.name="BMW";
		obj.wheels=4;
		
		
		obj1.name="Maruti";
		obj1.wheels=4;
		
		obj2.name="Nano";
		obj2.wheels=4;
		
		
		
		System.out.println(obj.name);
		System.out.println(obj.wheels);
		
		
		System.out.println(obj1.name);
		System.out.println(obj1.wheels);
		
		System.out.println(obj2.name);
		System.out.println(obj2.wheels);
		
	}

}
