package firstproject1;
 class twentyfour {
	 public void dd() {
		 System.out.println("Print 1st line");
	 }
 }
 class twentyfive extends twentyfour{
	 public void ee() {
		 System.out.println("Print 2nd line");
	 }
 }
 class twentysix extends twentyfive{
	 public void ff() {
		 System.out.println("Print 3rd line");
	 }
 }
 class twentyseven extends twentyfive{
	 
 }

public class HybridInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twentyseven obj=new twentyseven();
		obj.ee();
		obj.dd();
		twentysix obj1 = new twentysix();
		obj1.ff();
		obj1.ee();
		obj1.dd();
		twentyfive obj2= new twentyfive();
		obj2.ee();
		obj2.dd();
		twentyfour obj3 = new twentyfour();
		obj3.dd();
	}

}
