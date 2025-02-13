package firstproject1;

abstract class Twenty6{
	abstract public void sample12();
	abstract public void sample13();
}


class Twenty7 extends Twenty6{
	  public void sample12() {
		  System.out.println("executing the sample12 method");
	  }
	  public void sample13() {
		  System.out.println("executing the sample13 method");
	  }
}
public class Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Twenty7 obj= new Twenty7();
            obj.sample12();
            obj.sample13();
            
	}

}
