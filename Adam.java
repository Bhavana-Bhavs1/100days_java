package Progs_5;
import java.util.*;
public class Adam {
	static int square(int num)
	{
		return (num*num);
	}	
	static int rev(int num)
	{
		int rev=0;
		while(num > 0)  // 0 > 0 -> false 
		{
			int rem = num%10 ; // rem = 1%10 = 1
			rev = rev * 10 + rem ;  // rev 2*10+1 = 21
			num = num/10; // num = 1/10 = 0
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int num = sc.nextInt(); // num = 12
		int a = square(num);  // a = 144
		int b =   square(rev(num)); // b = 441
		
		if(a == rev(b)) // 144 = 144 -> true
			System.out.println("Adam Number");
		else
			System.out.println("Not Adam Number");
		
		

	}

}
