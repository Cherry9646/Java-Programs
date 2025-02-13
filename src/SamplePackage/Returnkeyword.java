package SamplePackage;
class One{
	 int aa = 60;
	public void show(){
		
	  System.out.println("Executing show method");
	}
	public int show1(){
		aa++;
	   return aa;
	}
	}
	public class Returnkeyword{
	 public static void main(String args[]){
	   One obj = new One();
	System.out.println(obj.aa);
	   obj.show();
	   int obj1=obj.show1();
	System.out.println(obj1);

	   }
	}

