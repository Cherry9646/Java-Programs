package firstproject1;

class three{
	double a = 40.56 , b = 60.57;
	public void Prakash() {
		a++;
		System.out.println("the updated value :" + " " + a);
		
	}
	 public double Ganesh() {
		 --b;
		 return b;
		 
	 }
}

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        three obj= new three();
         System.out.println(obj.a);
         obj.Prakash();
         double obj1=obj.Ganesh();
         System.out.println(obj1); 
      
	}

}
