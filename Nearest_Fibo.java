package Progs_3;
import java.util.*;
public class Nearest_Fibo {
	boolean isFibo(int n)   // n= 6
	 {
		 int a=0, b = 1, c=0;
		 while(c<n)
		 {
			 c = a+b; // c = 1
			 a=b;  // a = 1
			 b=c; // b = 1		 
		 }
		 if (c==n) // if n = fib no -> t
			 return true;
		 else  // n = 6 which is not fib no -> t
			 return false;
	 }
		int beforeFib(int n)  // n = 6
		{
			int c = 0;
			while(true)
			{
				if(isFibo(n)) // n= 6 -> f	 , n= 5
					return c;  // c = 1 -> n(5) is fibo
					else
					{
						n= n-1; // n = 6-1 = 5
						c++;  // c= 1
					}	
				}
			}
		int afterFib(int n) // n = 6
		{
			int c=0;
			while(true)
			{
				if(isFibo(n))  // n= 8
					return c; // c = 2
				else
				{
					n = n+1; // n = 8
					c++;  // c=2
				}
			}
		}
		
		void nearestFibs()
		{
			Scanner obj = new Scanner(System.in);
			System.out.println("enter number:");
			int n = obj.nextInt(); // n =6
			int m1 = beforeFib(n); // m1 = 1
			int m2 = afterFib(n); // m2 = 2
		
		if(m1>m2)
		{
			System.out.println("Nearest Fibonacci Number : ");
			System.out.println(n+m2);	// 6+2 = 8
		}
		else if(m2>m1)  // n= 6 -> 2 > 1 -> t
		{
		  	System.out.println("Nearest Fibonacci Number : ");
		  	System.out.println(n-m1); // 6-1 = 5
		}
		else if ( (n-m1)==(n+m2) ) // 5 == 5 -> t
			System.out.println(n+ " is a Fibonacci Number");
		else if (m1 == m2 )  // n = 4 -> m1 = m2 =1
		{
			System.out.println("Nearest Fibonacci Numbers are: ");
			System.out.println((n-m1)+" "+(n+m2));  // 3 5
		}
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nearest_Fibo obj = new Nearest_Fibo();
		obj.nearestFibs();

	}

}
