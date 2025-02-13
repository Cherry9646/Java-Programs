package firstproject1;
//static key word
class Twenty{
	static int aa= 100;
	static public void sample11() {
		System.out.println("executing the sample method"  + aa);
	}
}
public class NonAccessModifier1 {
	static {
		System.out.println("executing the static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(Twenty.aa);
               Twenty.sample11();
	}

}
