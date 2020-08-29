package Progs_2;
import java.util.*;
public class Circular_Prime {
	static boolean isPrime(int n)
	{
		boolean f=true;
		for(int i = 2; i <= n/2; i++)
		{
			if(n%i ==0)
			{
				f = false;
				break;
			}
		}
	return f;
	}
	
	static boolean Circular(int n)  //n = 113
	{
		int c =0,  t = n;  // t = 113
		// 1. count digits in number
		while(t >0) // 1 > 0
		{
			c++; // c=3
			t = t/10;  // 11/10 =1 
		}
		
		// 2. check prime or not
		int num = n; // num = 113
		while(isPrime(num))  //  131 -> true
		{
	
		//3.generating cyclic permuting numbers
			
			int rem = num%10;  // 131%10 = 1
			int div = num/10;  // 131/10 = 13
			
			num = (int)((Math.pow(10,c-1)) *rem   )+div;
			//    num =      10 power 2  -> 100 *  1 + 13 = 113
			if (num == n)  // 113 == 113 -> t
				return true;			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter number: ");
		 int n = sc. nextInt();  //113
		 if(Circular(n))
			 System.out.println("Circular number = "+n);
		 else
			 System.out.println("Not Circular number = "+n);


	}

}
