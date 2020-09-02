package Progs_5;
import java.util.*;
public class Number_Rotation {
	static int no_of_digits(int n)  // n = 1224
	{
		int c=0;
		while(n>0) // n = 0 > 0 -> false
		{
			c++; // c = 4
			n=n/10; // n = 0
		}
		return c; // c= 4
	}
	
	static void print(int num)  // num = 1224
	{
		int digits = no_of_digits(num); // digits = 4
		int n = (int)Math.pow(10,digits - 1); //  n = 1000
		
		for(int i = 0 ; i < digits -1 ; i++)  // i < 3 -> 0 , 1 , 2
		{
			int firstDigit = num/n ; // fd = 2241/1000 = 1
			int lastpos = ( (num*10) + firstDigit) - (firstDigit*n *10);
		// lp = 1224*10 + 1 = 12241  - (1*1000*10) = 10000
					// 12241 - 10000 = 2241
					System.out.println(lastpos+ " ");
					num = lastpos;  // 2241
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		int num = obj.nextInt();
		print(num);

	}

}
