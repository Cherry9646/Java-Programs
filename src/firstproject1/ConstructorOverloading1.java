package firstproject1;
//Constructor overloading by changing the data types of parameters
class sixtyseven{
	float aa; boolean bb;
	public sixtyseven(float aa1) {
		aa=aa1;
	}
	public sixtyseven(boolean bb1) {
		bb=bb1;
	}
	public void sample6() {
		System.out.println(aa+ "\n" + bb);
	}
}

public class ConstructorOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sixtyseven obj= new sixtyseven(18.6f);
		obj.sample6();
	}

}
