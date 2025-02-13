package firstproject1;
 class seven{
	 int a= 100;
	 public void Ramesh() {
		 System.out.println("Print this line");
	 }
 }
 class Eight extends seven{
	 
 }
 
public class SingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      seven obj= new seven();
      System.out.println(obj.a);
      obj.Ramesh();
     
	}

}
