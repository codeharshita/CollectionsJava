package ListConcept;
import java.util.*;

public class HashTableConcept {

	public static void main(String[] args) {
		// HashTable is similar to HashMap ,the only difference is that HASHTABLE is synchronised.
		// It also contains key and pair values.
		// Format:- 
		// Key --> Object --> HashCode --> Value.
		
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Jeery");
		h1.put(3 ,"Human");
		
		
		//Creating a clone copy or shallow copy;
		
		 Hashtable h2 = new Hashtable();
		 h2= (Hashtable)h1.clone();
		
		 System.out.println("The values of h1 object" +" "+  h1);
		 System.out.println("The values of h2 object" +" "+  h2);
		 
		 h1.clear();
		 System.out.println("The values of h1 object" +" "+  h1);
		 
		 System.out.println("The values of h2 object" +" "+  h2);
		 
		
		
		
	}

}
