package Progs_4;
import java.util.*;
public class Square_no_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		double x = obj.nextDouble();
		double sr = Math.sqrt(x);
		if( ( sr - Math.floor(sr)) == 0)
			 System.out.println("Square Number");
		else
			System.out.println(" Not Square Number ");

	}

}
