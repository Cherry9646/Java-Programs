package firstproject1;
// program on abstract method

abstract class Twenty4{
	abstract public void sample11();
}
class Twenty5 extends Twenty4{
	public void sample11() {
		System.out.println("executing the sample10 method");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Twenty5 obj = new Twenty5();
            obj.sample11();
	}

}
