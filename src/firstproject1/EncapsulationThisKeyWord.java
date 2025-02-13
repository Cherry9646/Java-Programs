package firstproject1;

class six{
	 int a;
	 int b;
	 public void Ranjith(int a, int b) {
		 this.a=a;
		 this.b=b;
		 System.out.println(a+ "\t" +b);
		 
		 
		 
		 
	 }
}

public class EncapsulationThisKeyWord {
	public static void main(String args[]) {
		six obj=new six();
		obj.Ranjith(40, 70);
		
	}

}
