package firstproject1;
   class twenty1 {
	   public void aa() {
		   System.out.println("Print 1st line");
	   }
   }
    class twentyone extends twenty1{
    	public void bb() {
    		System.out.println("Print 2nd line");	
    	}
    }
    class twentytwo extends twenty1{
    	public void cc() {
    		System.out.println("Print 3rd line");
    	}
    }
    class twentythird extends twenty1{
    	
    }
    
public class Hierarchiealinhertence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        twentythird obj= new twentythird ();
          obj.aa();
        twentytwo obj1= new twentytwo();
        obj1.cc();
        obj1.aa();
        twentyone obj2=new twentyone();
        obj2.bb();
        obj2.aa();
        twenty1 obj3 = new twenty1();
        obj3.aa();
        
	}

}
