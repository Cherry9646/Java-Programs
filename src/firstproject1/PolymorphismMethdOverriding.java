package firstproject1;
class sixtytwo{
	int a;
	public void sample2(int a1) {
		//a=a1;
		System.out.println("print" + "\t" + a);
	}
}
  class sixtythree extends sixtytwo{
	  int a;
	  public void sample2(int a1) {
		  a=a1;
		  System.out.println("Print1:" + "\t" + a);
	  }
  }

public class PolymorphismMethdOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sixtythree obj= new sixtythree();
       obj.sample2(20);
      
	}

}
