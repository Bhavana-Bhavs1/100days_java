package Basic_Prgs;
import java.util.*;
public class Fibo_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number");
		int n = sc.nextInt();  //5
		
		int a=0,b=1,c=0;
		
		while(c<n)   // 5<5
		{
			c=a+b;  // 5
			a=b;  // 3
			b=c;  // 5
		}
	     if (c==n)
	    	 System.out.println("Fibonacci Number");
	     else
	    	 System.out.println("Not Fibonacci Number");	

	}

}
