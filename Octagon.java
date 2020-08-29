package Basic_Prgs;
import java.util.*;
public class Octagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner obj = new Scanner(System.in);
		  System.out.println("enter the length of a side :");
		  float s = obj.nextFloat();
		  float a = (float)(2*(1+Math.sqrt(2)) * s *s);
		  System.out.println("Area of Octagon = "+ a);
		

	}

}
