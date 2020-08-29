package Basic_Prgs;
import java.util.*;
public class Equi_tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter side of a triangle:");
		float s = obj.nextFloat();		
		float a = (1.73f * s *s )/4;		
		System.out.println("Area of Equilateral Triangle = "+a);

	}

}
