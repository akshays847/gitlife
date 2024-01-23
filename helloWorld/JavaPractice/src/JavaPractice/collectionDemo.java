package JavaPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class collectionDemo {

	public static void main(String[] args) {
		
		
		ArrayList obj1 = new ArrayList();
		obj1.add("test");
		
		obj1.add(14);
		
		Iterator itr = obj1.iterator();
		
		while(itr.hasNext()){
			
			Object value = itr.next();
			
			System.out.println(value);
			
		}
		
		
		
		
		

	}

}
