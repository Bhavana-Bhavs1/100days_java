package Progs_6;
import java.util.*;
public class Smith {
	static int sumdigits(int n)
	{
	int s=0;
	while(n>0) // 6>0
	{
		int rem = n%10; // rem= 6%10 = 6
		s = s+rem; // s = 7+3 = 10
		n=n/10; // n= 66/10 = 6
	}
	return s; // s = 10
}

static int sumprimefactors(int n)// n = 666
{
	int i=2, sum =0;
	
	while(n>1) // 1>1 -> f
	{
		if(n%i==0) // i=37,  37%37 == 0 -> t
		{
			sum = sum + sumdigits(i); // sum = 8+10 = 18 
			//here, i is prime factor
			n= n/i; // n =37/37 = 1
		}
		else
			i++; // i=37
	}
	return sum; // sum =18
	
}

static boolean Composite(int n) // n =13
{
	int c=0;
	for(int i=1; i<=n; i++)
	{
		if(n%i == 0)
		{
			c++; // c=2
		}
	}
	if(c>2) // 2>2 -> f
		return true;
	else
		return false; // c =2
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n= sc.nextInt(); // n = 666
		
		if(Composite(n)==false)
			System.out.println("Enter composite number !");
		else
		{
		int a = sumdigits(n);  // a = 18
		int b = sumprimefactors(n); // b = 18
	System.out.println("sum of digits = "+a);
	System.out.println("sum of prime factors = "+b);
	if(a==b)
		System.out.println(n + " is a Smith Number" );
	else
		System.out.println(n + " is Not Smith Number ");
		}
		
		

	}

}
