package firstproject1;
import java.util.*;
//Hashset class
public class CollectionsSetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Set obj = new HashSet();
          obj.add("Hyderabad");
          obj.add("Chennai");
          obj.add("Vizag");
          obj.add("Vijayawada");
          System.out.println(obj);
          obj.remove("Vizag");
          System.out.println(obj);
          		
	}

}
