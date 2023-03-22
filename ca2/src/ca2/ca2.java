package ca2;
import java.util.HashMap;
import java.util.Map;

public class ca2 {

	public static void main(String[] args) {
		// Map creation of student and grades 
		Map<String, String> hm = new HashMap<>();
		 hm.put("John", "A");
		 hm.put("mike","A");
		 hm.put("Arjun", "A+");
		 hm.put("Karan", "B");
		 hm.put("Adi","C");
		 hm.put("john", "B");
		 for (Map.Entry<String, String> e : hm.entrySet())
			 
	            {System.out.println(e.getKey() + " "
	                               + e.getValue());}
		 //correction of grades
		 hm.put("John", "C");
		 for (Map.Entry<String, String> e : hm.entrySet())
			 
         {System.out.println(e.getKey() + " "
                            + e.getValue());}

	}

}
