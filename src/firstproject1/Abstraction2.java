package firstproject1;

abstract class Twenty8{
	abstract public void sample14();
	public void sample15() {
		System.out.println("Executing sample15 method");
	}
}
class Twenty9 extends Twenty8{
	public void sample14() {
		System.out.println("Executing sample14 method");
	}
}
public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Twenty9 obj= new Twenty9();
                obj.sample14();
                obj.sample15();
	}

}
