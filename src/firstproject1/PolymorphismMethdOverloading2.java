package firstproject1;
//method overloading by changing the sequence of parameters

class sixtyone{
	int a; float b;
	public void sample1(int a1, float b1) {
		a=a1;
		b=b1;
		
		System.out.println(a + "\t"+ b);
	}
	public void sample1(float b1, int a1) {
		b=b1;
		a=a1;
		System.out.println(b + "\t" + a);
	}
}
public class PolymorphismMethdOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        sixtyone obj=new sixtyone();
        obj.sample1(20,30.8f);
	}

}
