package Progs_3;
import java.util.*;
public class Fibo_series_upto_nth_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		int n = obj.nextInt(); // n = 10
		int t1 = 0 , t2 = 1;
		System.out.println("Fibonacci numbers upto given number:"+n);
		System.out.print(t1);  // t1 = 0  
		int sum=0;
		for(int i = 2; sum<n; i++) // 2<10
		{	
			sum = t1 + t2; // sum = 0+1 = 1
			t1 = t2;  // t1 = 1
			t2 = sum;  // t2 = 1		
			System.out.print(" "+t1);  //0 1 1 2
		}

	}

}
