package firstproject1;
import java.util.*;
// Iterator
public class CollectionsIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              ArrayList obj= new ArrayList();
              obj.add("charan");
              obj.add(98.87);
              obj.add('m');
              obj.add(true);
              System.out.println(obj);
              Iterator obj2 =obj.iterator();
              int i =0;
               while(obj2.hasNext())
            	   {
            	   Object obj3 = obj2.next();
            	   if (i ==2) {
            		   obj2.remove();
            		   System.out.println("removed");
            	   }
            	   i++;
            	   System.out.println(obj);
               }
	}

}
