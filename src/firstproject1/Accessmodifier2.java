package firstproject1;
import SamplePackage.Thirtyone;

//protected access modifier

class thirtyseven extends Thirtyone{
	public void sample10(){
		super.sample9();
		System.out.println("executiing sample10 method");
	}
	
	
}
public class Accessmodifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thirtyseven obj= new thirtyseven();
          obj.sample10();
        	  
	}

}
