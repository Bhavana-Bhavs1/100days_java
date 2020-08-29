package Progs_2;
import java.util.*;
public class Nearest_Primes {
	boolean isPrime(int n)  //n = 20
	{
		int c=0;
		for(int i=2; i<n; i++) // omitted 1 and 20
		{
			if(n%i == 0)  //  20/2 == 0 -> t
				c++;  // c = value 
		}
		if (c==0)
			return true; // for 19 true
		else
			return false; // for 20 false
	}
	
	int beforePrime(int n)  // n= 20
	{
		int c=0;
		while(true)
		{
			if(isPrime(n))    // n = 19
				return c;   // c=1
			else
			{
				n = n-1;  // n=19
				c++;  // c= 1
			}
				
		}
	}
	
	int afterPrime(int n)  //n = 20
	{
		int c=0;
		while(true)
		{
			if(isPrime(n))  //n= 23 -> false
				return c; // c = 3
			else
			{
				n = n+1; // n =23
				c++; // c=3
			}
		}
	}
	
	void nearestPrimes()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number:");
		int n = obj.nextInt();  // n = 20
	    int m1 = beforePrime(n);  // m1 = 1
	    int m2 = afterPrime(n);  // m2 = 3
	    
	    if(m1>m2)  // 1>3 -> f
	    {
	    	System.out.println("Nearest prime:");
	    	System.out.println(n+m2);
	    }
	    else if(m2>m1)  // 3>1 -> t
	    {
	    	System.out.println("Nearest prime:");
	    System.out.println(n-m1);  // 20-1 = 19
	    }
	    else
	    {
	    	System.out.println("Nearest primes are:");
		    System.out.println((n-m1)+" "+(n+m2));
		    		
	    }   
	    
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nearest_Primes obj = new Nearest_Primes();
		obj.nearestPrimes();
		

	}

}
