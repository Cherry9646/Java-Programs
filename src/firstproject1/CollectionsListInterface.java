package firstproject1;
import java.util.ArrayList;
// ArrayList to store different datatype values

public class CollectionsListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             ArrayList obj = new ArrayList();
             obj.add("charan");
             obj.add(98.87);
             obj.add('m');
             obj.add(true);
             System.out.println(obj);
             obj.remove(0);
             System.out.println(obj);
             System.out.println(obj.get(1));
             
	}

}
