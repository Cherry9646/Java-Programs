package firstproject1;
class five{
	int a;
	float b;
	String c;
	char d;
	boolean e;
	public void Sai(int f, float g, String h,char i,boolean j ) {
		a=f;
		b=g;
		c=h;
		d=i;
		e=j;
		System.out.println(a + "\t" + b+ "\t" + c + "\t" +d + "\t" + e  );
	}
}
public class EncapsulationCallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         five obj=new five();
         obj.Sai(30, 38.5f, "charan", 'c', true );
         
	}

}
