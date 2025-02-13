package firstproject1;
//Constructor overloading by changing the sequence of parameters
class sixtyeight{
	int aa; float bb;
	public sixtyeight(int aa1, float bb1){
		aa= aa1;
		bb= bb1;
		
		}
	public sixtyeight(float bb1, int aa1){
		aa= aa1;
		bb= bb1;
		
		}
	public void sample7() {
		System.out.println(aa+"\n" + bb);
	}
	
	
	}  
public class ConstructorOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sixtyeight obj=new sixtyeight(35.5f, 50);
		obj.sample7();
	}

}
