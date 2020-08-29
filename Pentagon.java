package Basic_Prgs;
import java.util.*;
public class Pentagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj = new Scanner (System.in);
		  System.out.println("enter side value:");
		  int s = obj.nextInt();
		  System.out.println("enter apothem length:");
		  int a = obj.nextInt();
		  float area = (float)(5/2)*s*a;
		  System.out.println("Area of pentagon = "+area);

	}

}
