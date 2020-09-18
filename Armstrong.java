package Progs_6;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt(); // n = 1634
		int c=0,temp = n; //temp = 1634	
		int d = 0;
		// count no of digits
		while(n>0)
		{
			int rem= n%10; // rem = 1634%10 = rem = 4
			d++; // d= 4
			n= n/10; // n= 1634/10 = 163
		}
		n=temp; // n= 1634
		while(n>0) // 0>0 -> f
		{
			int rem = n%10; // rem = 1634%10 = 4
			c = c+ (int)Math.pow(rem,d); // c =1634 
			n=n/10; // n= 1634/10 = 163
		}
		if(temp == c) // 1634 == 1634
		System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
		

	}

}
