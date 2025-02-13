package firstproject1;
//Constructor overloading by changing the number of parameters
class sixtysix{
	int aa; int bb;
	public sixtysix(int aa1, int bb1){
		aa= aa1;
		bb= bb1;
		
	}
	public sixtysix(int aa1){
		aa= aa1;
	}
	  public void  sample5() {
		  aa++;
		  bb--;
		  System.out.println(aa + "\n" + bb);
		  
	  }  
} 
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sixtysix obj = new sixtysix(40, 60);
		obj.sample5();
	}

}
