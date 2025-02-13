package firstproject1;
import java.util.*;
//vector class
public class CollectionsListInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Vector obj = new Vector();
           obj.addElement("Hyderabad");
           obj.addElement('m');
           obj.addElement(8756);
           System.out.println(obj);
           obj.removeElement("Chennai");
           System.out.println(obj);
           System.out.println(obj.get(1));
	}

}
