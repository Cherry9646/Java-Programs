package firstproject1;
//null pointer exception

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   String aa = null;
    	   System.out.println(aa.length());
       }
       catch(NullPointerException f) {
    	   System.out.println("Please enter proper String values");
       }
	}

}
