package firstproject1;
class sixtyfive {
	int aa; float bb; String cc; char dd; boolean ee;
	public sixtyfive(int aa1, float bb1, String cc1, char dd1, boolean ee1) {
		aa = aa1;
		bb=bb1;
		cc=cc1;
		dd=dd1;
		ee=ee1;
		
	}
	public void sample4() {
	System.out.println(aa + "\n" + bb + "\n"+ cc + "\n"+dd +"\n" + ee);
	}
}

public class ParameterisedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sixtyfive obj=new sixtyfive(40,45.7f, "charan", 'c', true);
		obj.sample4();
	}

}
