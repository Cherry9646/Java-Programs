package firstproject1;

public interface Fourty3 {
	int aa = 100;
	public void sample17();
	}
interface Fourty4{
	public void sample18();
	
}
class Fourty5 implements Fourty3, Fourty4{
	public void sample17() {
		System.out.println("Executing sample17 method");
	}
	public void sample18() {
		System.out.println("Executing sample18 method");
	}
}