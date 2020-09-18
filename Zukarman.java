package Progs_6;
import java.util.*;
public class Zukarman {
	// function return product of digits of a given number
		static int display(int n) // n= 115
		{
			int p = 1;
			while( n != 0)// 0 != 0 -> f
			{
				int rem = n%10; // rem = 1%10 = 1
				p = p* rem; // p = 5*1 = 5
				n = n/10; // n= 1/10 = 0
			} 
			return p; // p = 5
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt(); // n = 115
		
		if(n % display(n) == 0) // 115%5 == 0 -> t
			System.out.println("Zukarman Number");
		else
			System.out.println("Not Zukarman Number");
		
		

	}

}
