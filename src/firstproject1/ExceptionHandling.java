package firstproject1;
//arithmetic Exception 

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int aa = 10; int bb;
            
            try {
            	bb=aa/0;
            	System.out.println(bb);
            }
            catch(ArithmeticException f) {
            	System.out.println("Please enter proper values for division");
            }
            
	}

}
