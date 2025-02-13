package firstproject1;
//method overloading by changing the data types of parameters
class fiftyone{
	char a; String b;
	public void sample1(char a1) {
		a=a1;
		System.out.println(a);
	}
	public void sample1(String b1) {
		b=b1;
		System.out.println(b);
	}																		
}

public class PolymorphismMethdOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        fiftyone obj= new fiftyone();
        obj.sample1('c');
	}

}
