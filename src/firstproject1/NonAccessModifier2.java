package firstproject1;
// Example for static and non static
class Twenty1{
	static int aa= 100; String bb = "charan";
	static public void sample11() {
		System.out.println("executing the sample method"  + aa);
	}
	   public void sample12() {
		   System.out.println("executig sample12 method" + "\t" + aa+ "\t" + bb);
		   
	   }
}

public class NonAccessModifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(Twenty1.aa);
          Twenty.sample11();
          Twenty1 obj= new Twenty1();
          obj.sample12();
	}

}
