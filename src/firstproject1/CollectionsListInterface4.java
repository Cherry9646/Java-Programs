package firstproject1;
import java.util.*;
//stack class

public class CollectionsListInterface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Stack obj= new Stack();
             obj.push("Hyderabad");
             obj.push(9879);
             obj.push(true);
             System.out.println(obj);
             obj.pop();
             System.out.println(obj);
             System.out.println(obj.get(0));
	}

}
