package firstproject1;
  class Ten{
	  public void Cherry() {
			 System.out.println("Print this  1st line");
  }
  }
  class Eleven extends Ten{
	  public void Hari() {
		  System.out.println("Print this  2nd line");
  } 
  }
  class Twelve extends Eleven{
	  public void Satish() {
		  System.out.println("Print this  3rd line");
  }
  }
  class Thirteen extends Twelve{}

public class MultiLevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thirteen obj= new Thirteen();
       obj.Satish();
       
       Twelve obj1= new Twelve();
       obj1.Satish();
       obj1.Hari();
       Eleven obj2= new Eleven();
       obj2.Hari();
       obj2.Cherry();
       Ten obj3= new Ten();
       obj3.Cherry();
       
	}

}
