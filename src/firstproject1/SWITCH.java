package firstproject1;

public class SWITCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String aa= "india";
    String bb= "China";
    String cc= "USA";
    String dd= "UK";
     switch(bb) {
     case "india":
     {
    	 System.out.println("The capital city of India is New Delhi");
    	 break;
    	 }
     case "China":
     {
    	 System.out.println("The capital city of China is Beijing");
      break; 
     }
     case "USA":
     {
    	 System.out.println("The capital city of USA is Washington DC");
    	 break;
     }    	 
     case "UK":
     {
    	 System.out.println("The capital city of UK is London");
    	 break;
     }
      default:
      {
    	  System.out.println("Invaid");  
      }
    	   
	}

 }
}
