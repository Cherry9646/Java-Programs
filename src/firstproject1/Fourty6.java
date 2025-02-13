package firstproject1;

public interface Fourty6 {
	public void sample18();
	}
interface Fourty7 extends Fourty6{
	public void sample19();
	
}
class Fourty8 implements Fourty7{
	public void sample18() {
		System.out.println("Executing sample18 method");
	}
	public void sample19() {
		System.out.println("Executing sample19 method");
	}
	
}
