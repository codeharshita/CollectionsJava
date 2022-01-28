package ListConcept;
import java.util.*;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//Create an object
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("SANA", 42);
		hm.put("Solak", 36);
		hm.put("POPDF",17);
	
		System.out.println(hm.get("SANA"));
		System.out.println(hm.get("Solak"));
		System.out.println(hm.get("POPDF"));
		
		
	
	}

}
