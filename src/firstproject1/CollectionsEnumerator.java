package firstproject1;
import java.util.*;

public class CollectionsEnumerator  extends Vector{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Vector obj = new Vector();
          obj.addElement("Charan");
          obj.addElement("Prakash");
          obj.addElement("Ranjith");
          obj.addElement("Mani");
          Enumeration  obj1 = obj.elements();
          //int i = 0;
          while (obj1.hasMoreElements()) {
        	  Object obj2 = obj1.nextElement();
        	  System.out.println(obj2);
          }
          

	}
	

}
