package firstproject1;
import java.util.*;
//ListIterator
public class CollectionsListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              ArrayList<String> obj = new ArrayList<String>();
              obj.add("charan");
              obj.add("Prakash");
              obj.add("Ranjith");
              obj.add("Mani");
              System.out.println(obj);
              ListIterator<String> obj1 = obj.listIterator();
               System.out.println("Forward direction");
               while (obj1.hasNext()) {
            	   String obj2 = obj1.next();
            	   System.out.println(obj2);
               }
               System.out.println("backward direction");
               while (obj1.hasPrevious()) {
            	   String obj3 = obj1.previous();
            	   System.out.println(obj3);
               }
	}

}
