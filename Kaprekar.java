package Progs_6;
import java.util.*;
public class Kaprekar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt(); // n= 45
		
		int count =0;
		int firstpart=0;
		int secondpart =0;
		int sum =0;
		// square a given number
		int square = n*n; // square = 2025
		
		int temp = square; // temp = 2025
		// count digits in a number
		while(temp != 0) // 0 != 0 -> f
		{
			count++; // count = 4
			temp = temp/10; // temp = 2/10 = 0
		}
		
		// divide into parts and check its sum = number
		
		for(int i = count - 1; i>0; i--)// i = 2, 2>0 -> t		
		{
			firstpart = square / (int)Math.pow(10,i); 
			// firstpart = 2025/100 = 20
			secondpart = square%(int)Math.pow(10,i);
			// secondpart = 2025%100 = 25
			
			if(firstpart ==0 || secondpart == 0 )
				continue;
			
			sum = firstpart + secondpart; // sum = 20+25 = 45,
			if(sum == n ) // 45 == 45 -> t
			{
			System.out.println(n + " is a Kaprekar Number ");
			break;
			}
		}	
		if(sum != n)
			System.out.println(n+" is Not a Kaprekar Number");
		

	}

}
