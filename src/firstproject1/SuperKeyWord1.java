package firstproject1;
//super keyword to access constructor
class seventyone{
	
	public  seventyone() {
		System.out.println("Print 1st line");
	}
}
class seventytwo extends seventyone{
	public seventytwo() {
		super();
		System.out.println("Print this line");
	}
}

public class SuperKeyWord1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           seventytwo obj= new seventytwo();
	}

}
