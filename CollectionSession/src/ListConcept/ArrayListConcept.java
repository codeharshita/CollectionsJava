package ListConcept;

import java.util.*;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		int a[]= new int[10];//Static array declaration.
		
		
		
				 ArrayList ar = new ArrayList();// ArrayList object creation
		 
		 
		 
		 ar.add(21);//0
		 ar.add(40);//1
		 ar.add(90);//2
		 
		 System.out.println(ar.size());
		 
		 ar.add(10);//3
		 ar.add(50);//4
		 ar.add(63);//5
		 ar.add(40);//6
		 
		 System.out.println(ar.size());
		 
		 System.out.println(ar.get(6));
		 
		 System.out.println();
		 //To retrieve all values in the ArrayList 
		 
		 //1) for loop
		 //2) iterator
		 
		 System.out.println("Retrieving all the values from the ArrayList we get: ");
		 
		 for(int i = 0; i<ar.size();i++) {
			 System.out.println(ar.get(i));
		 }
		 
		 
	}

}
