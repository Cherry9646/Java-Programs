package firstproject1;
//all methods of String Buffer class
public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer obj = new StringBuffer("Hyderabad");
		StringBuffer obj1 = new StringBuffer("SECUNDERBAD");
		System.out.println(obj.append(obj1));
		System.out.println(obj);
		System.out.println(obj1.insert(10,"AMEERPET"));
	      System.out.println(obj1.reverse());
	}

}
