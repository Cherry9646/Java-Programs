package firstproject1;
import java.util.*;
// LinkedList class
public class CollectionsListInterface3 extends LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionsListInterface3 obj = new CollectionsListInterface3();
          obj.addFirst("Hyderabad");          
            obj.addFirst("Chennai");
          System.out.println(obj);
          obj.addLast("Vizag");
          obj.addLast("Vijayawada");
          System.out.println(obj);
          Object obj1 = (Object) obj.getFirst();     
          System.out.println(obj1);
          Object obj2 = (Object) obj.getLast();
          System.out.println(obj2);
          obj.removeFirst();
          System.out.println(obj);
          obj.removeLast();
          System.out.println(obj);
          
	}

}
