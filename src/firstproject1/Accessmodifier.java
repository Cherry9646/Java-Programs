package firstproject1;
//private access modifier

class thirty{
private int aa= 100;
	public void sample7() {
		System.out.println("The value of aa:"+ "\t"+ aa);
	}
}

public class Accessmodifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         thirty obj= new thirty();
         obj.sample7();
       //System.out.println(obj.aa);
	}

}
