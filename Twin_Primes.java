package Progs_2;
import java.util.*;
public class Twin_Primes {
	static boolean isPrime(int n)  //3
	{
		boolean f = true;
		for(int i = 2; i<= n/2; i++)  // 2 <= 3/2
		{
			if(n%i==0 )  // 3%2 == 0 -> f
			{
				f= false;
				break;
		    }					
	    }
    return f;		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n1,n2;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("enter number1:");
	     n1 = sc.nextInt();
	     System.out.println("enter number2:");
	     n2 = sc.nextInt();
	     if (isPrime(n1)==true && isPrime(n2)==true && (n2-n1)== 2 )
	    	System.out.println("Twin Prime Number") ;
	     else
	    	 System.out.println("Not Twin Prime Numbers"); 

	}

}
