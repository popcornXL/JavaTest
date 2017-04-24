import java.util.Map;
import java.util.Random;
import java.util.Iterator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Collection;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testHashMapAPIs();
	}
	 private static void testHashMapAPIs() {
		 	
	 
	        Random r = new Random();
	       
	        HashMap map = new HashMap();
	      
	        map.put("one", r.nextInt(10));
	        map.put("two", r.nextInt(10));
	        map.put("three", r.nextInt(10));
	        
	   
	        System.out.println("map:"+map );
	        
	     
	        Iterator iter = map.entrySet().iterator();
	        while(iter.hasNext()) {
	            Map.Entry entry = (Map.Entry)iter.next();
	            System.out.println("next : "+ entry.getKey() +" - "+entry.getValue());
	        }
	        
	        
	        System.out.println("size:"+map.size());
	        
	       
	        System.out.println("contains key two : "+map.containsKey("two"));
	        System.out.println("contains key five : "+map.containsKey("five"));
	        
	       
	        System.out.println("contains value 0 : "+map.containsValue(new Integer(0)));

	        
	        map.remove("three");

	        System.out.println("map:"+map );

	       
	        map.clear();

	   
	        System.out.println((map.isEmpty()?"map is empty":"map is not empty") );
	    }
}
