package firstproject1;
import java.util.*;
// TreeMap class

public class CollectionsMapInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map obj = new TreeMap();
	       obj.put("a", "Hyderabad");
	       obj.put("b", "Vijayawada");
	       obj.put("c", "Vizag");
	       obj.put("d", "Chennai");
	       String obj1 = (String) obj.get("c");
	       System.out.println(obj);
	       System.out.println(obj1);
	       Integer obj2 = new Integer(10);
	       obj.put("1",obj2);
	       System.out.println(obj);

	
	}

}
