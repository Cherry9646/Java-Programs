package firstproject1;
//final key word
 final class Twenty2{
	 final int a= 50;
final 	 public void thumati() {
	    a= 100;
	    
		System.out.println("sample method" + "\t" + a);
	}
}
  class Twenty3 extends Twenty2{
	 
	  public void thumati() {
		 
		  System.out.println("executing sample method");
	  }
  }

public class NonAccessModifier3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Twenty3 obj=new Twenty3();
         obj.thumati();
	}

}
