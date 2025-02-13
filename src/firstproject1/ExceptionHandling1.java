package firstproject1;
// Array index out of bounds exception
public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
        	  int abc [] = new int [4];
        	  abc[0]= 10;
        	  abc[1]= 20;
        	  abc[2]= 30;
        	  abc[3]= 40; 
        	  System.out.println(abc[5]);
        	  }
          catch(ArrayIndexOutOfBoundsException f) {
        	  System.out.println("Please enter correct index");
          }
	}
}
