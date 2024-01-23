package JavaPractice;

import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		
		
		HashMap<String, String> obj1 = new HashMap<String, String> ();
		
		obj1.put("1", "aks");
		obj1.put("2", "jj");
		obj1.put("4", "js");
		obj1.put("99", "akshay");
		obj1.put("100", "aksharma");
		obj1.put("101", "akslll");
		obj1.put("101", "akslll");
		
		System.out.println(obj1);
		
		String value = obj1.get("101");
		
		System.out.println(value);

	}

}
