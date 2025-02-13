package firstproject1;
//method overloading by changing the number of parameters
class fifty {
int a; int b; int c;
	
		public void Sample(int a1, int b1) {
			a=a1;
			b=b1;
			System.out.println(a + "\t" + b);
			
		}
		public void Sample(int a1, int b1, int c1) {
			a= a1;
			b=b1;
			c=c1;
		System.out.println(a + "\t" + b + "\t" + c);
		}
		
	}
	
	
public class PolymorphismMethdOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            fifty obj = new fifty();
            obj.Sample(20, 47,900);
            
	}

}
