package firstproject1;

class two{
	int a = 50, b = 60;
	  public void Show() {
		  a++;
		  System.out.println("the updated values :" + a);
	  }
	  public void Sravan() {
		  --b;
		  System.out.println("the updated values :" + b);
	  }
}

public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         two obj=new two();
         System.out.println(obj.a + "\t"+ obj.b);
         obj.Show();
         two obj1=new two();
         System.out.println(obj1.a + "\t"+ obj1.b);
         obj1.Sravan();
	}

}
