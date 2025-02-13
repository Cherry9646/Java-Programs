package firstproject1;
//One try many catch key words
public class ExceptionHandling5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	    	   String aa = "Charan";
	    	  System.out.println(aa.length());
	    	  int abc []= {10,15,30};
	    	  System.out.println(abc[3]);
	       }
	       catch(NullPointerException f) {
	    	   System.out.println("Please enter proper String values");
	       }
		catch(ArrayIndexOutOfBoundsException f) {
	    	   System.out.println("Please enter proper correct index");
	       }
	}

}
