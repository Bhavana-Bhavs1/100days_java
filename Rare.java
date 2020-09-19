package Progs_6;
import java.util.*;
public class Rare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt(); // n=65
		if (rare(n))  
		System.out.println("Rare Number");
		else
			System.out.println("Not Rare Number");
	}
	
	static int revdigits(int num) // 65
	{
		int rev =0;
		while(num>0) // 0>0 -> f
		{
			int rem = num%10;   // rem = 6%10 = 6
			rev = rev*10 + rem; // rev = 5*10 + 6 = 56
			num = num/10; // num=6/10 = 0
		}
		return rev; // rev = 56
	}
	
	static boolean rare(int N) // N= 65
	{
		int revN = revdigits(N); // revN = 56
		//check given is Non-palindrome
		if( revN == N) // if palindrome
			 return false;
		
		return sq(N+ revN)  && sq(N-revN);		
		
	}
	
	static boolean sq(double x)
	{
		double sr = Math.sqrt(x);
		return (( sr - Math.floor(sr)) == 0);
	

	}

}
