package firstproject1;

public class MULTIDIMENTIONAL_STATIC_ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double abc[][]= new double[2][3];
           abc[0][0]= 20.5;
           abc[0][1]= 30.6;
           abc[0][2]= 25.5;
           abc[1][0]= 55.5;
           abc[1][1]= 50.5;
           abc[1][2] = 40.4;
           
           System.out.println(abc[0][0]+ "\t" + abc[0][1] + "\t" + abc[0][2]);
           System.out.println(abc[1][0]+ "\t" + abc[1][1]+ "\t" + abc[1][2]);
       
	}

}
