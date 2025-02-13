package firstproject1;
import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 System.out.println("Enter your name");
                 Scanner obj = new Scanner(System.in);
                 String name = obj.nextLine();
                 System.out.println("Enter your employee ID");
                 Scanner obj1 = new Scanner(System.in);
                 int ID = obj1.nextInt();
                 System.out.println("Enter your salary");
                 Scanner obj2 = new Scanner(System.in);
                 Float Salary = obj2.nextFloat();
                 System.out.println("Enter your name" + " " + name);
                 System.out.println("Enter your employee ID" + " " + ID);
                 System.out.println("Enter your salary" + " " +Salary);
	}

}
