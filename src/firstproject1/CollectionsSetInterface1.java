package firstproject1;
import java.util.*;
//TreeSet class
public class CollectionsSetInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Set obj= new TreeSet();
                obj.add("Hyderabad");
                obj.add("Chennai");
                obj.add("Tamilnadu");                
               System.out.println(obj);
            obj.remove("Chennai");
                System.out.println(obj);            
                
                
	}

}
