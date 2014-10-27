package practice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;


public class hmiteratioin {

	@Test
	public static void abcd() {
		// TODO Auto-generated method stub
		
		
		Map<Integer,String> map = new HashMap<Integer,String> ();
		
		map.put(1, "delhi");
		map.put(2, "bangalore");
		map.put(3, "bombay");
		map.put(4, "ny");
		
		for (Map.Entry<Integer,String> entry: map.entrySet() )
		{
			
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		Iterator<Map.Entry<Integer,String>> itr1 = map.entrySet().iterator();
		while(itr1.hasNext()) {
		    Map.Entry<Integer,String> entry = itr1.next();
		   System.out.println(entry.getKey()+": "+entry.getValue());
		 
		}
	}

	 

}
