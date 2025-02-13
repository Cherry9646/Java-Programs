package firstproject1;

class One{
	int dd = 300;
	 public void charan() {
		 dd++;
		 System.out.println(dd);
	 }
	 
}



public class Encapsulationclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        One obj=new One();
        System.out.println(obj.dd);
         obj.charan();
	}

}
