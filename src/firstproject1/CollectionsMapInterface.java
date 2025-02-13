package firstproject1;
import java.util.*;
//HashMap class
public class CollectionsMapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map obj = new HashMap();
       obj.put("1", "Hyderabad");
       obj.put("2", "Vijayawada");
       obj.put("3", "Vizag");
       obj.put("4", "Chennai");
       String obj1 = (String) obj.get("3");
       System.out.println(obj);
       System.out.println(obj1);
       Integer obj2 = new Integer(10);
       obj.put("a",obj2);
       System.out.println(obj);

}
}