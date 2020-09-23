package Progs_6;
import java.util.*;
public class canada {
	static int sum_sq(int n) // n=125
	{
	int sum =0;
	while(n != 0 )// 0 != 0 -> f
	{
		int rem = n%10; // rem =1%10= 1
		sum = sum + rem*rem; // sum=29+ 1*1 = 30
		n = n/10 ; // n= 1/10 = 0
	}
	return sum; // sum = 30
	}
	
	static int sum_div(int n) // n =125
	{
		int div =0;
		for(int i=1; i<= Math.sqrt(n);i++) // i=1,5..11,12 -> f
		{
			if(n%i==0) // 125%5 ==0 -> 1
				div = div + i + n/i ; // div=126+5+25 = 156			
		}
	
	return (div - 1 - n); // 156-1-125= 30
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter number :");
	    int n = sc.nextInt(); // n = 125
	    if(sum_sq(n) == sum_div(n))
	    	System.out.println("canada number");
	    else
	    	System.out.println("not canada number");

	}

}
