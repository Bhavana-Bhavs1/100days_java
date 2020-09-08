package Progs_5;
import java.util.*;
public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt();  // n = 12113
		int c, flag = 1;
		int no = n; // no = 12113
		for(int i=0 ; i<= 9; i++)// digits present from 0 - 9
		{  // i = 1
			n = no; // n = 12113
			c = 0;
			//below loop checks for a digit repeated ?
			while( n > 0) // 0 > 0 -> f
			{
				int d = n%10 ; // d = 1%10 = 1
				if(d == i )  // 1 == 1 -> t
					c++; // c= 3
				n =n /10; // n= 1/10= 0
			}// end of while loop
			if (c > 1) // 3>1 -> t  , repeated digit found breaks loop
			{
				flag =0;
				break;
			}
		}// end of for loop
			if(flag ==1 ) // unique			 
				System.out.println("It is a Unique Number");
				else // flag = 0
			System.out.println("It is Not a Unique Number");

	}

}
