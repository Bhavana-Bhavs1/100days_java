package Progs_6;
import java.util.*;
public class Abundant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n= 12
		if(display(n) > n) // 16 > 12
			System.out.println("Abundant Number");
		else
			System.out.println("Not Abundant Number");
		}
		
		static int display(int n) // n=12
		{
			int sum =0;
			for(int i=1; i<= (Math.sqrt(n));i++) // i=1,2,3, 4-> f
			{
				if(n%i==0) // //12%3 ==0 -> t
				{
					sum = sum + i + (n/i); // sum =21+3+(12/3)=28
				}
			}
			sum = sum-12; // sum 16
			return sum;

	}

}
