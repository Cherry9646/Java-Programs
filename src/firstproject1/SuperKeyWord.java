package firstproject1;
//super keyword to access variables and method

class sixtynine{
	String aa= "charan";
	
	  public void Sample3(){
		  System.out.println("execute first line");
		  
	  }
}
class seventy extends sixtynine{
	public void Sample4() {
		System.out.println(super.aa);
		super.Sample3();
		System.out.println("execute second line");
	}
	
}
public class SuperKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         seventy obj=new seventy();
         obj.Sample4();
	}

}
