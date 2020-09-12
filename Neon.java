package Progs_6;
import java.util.*;
public class Neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt(); // n = 9
		int sq = n*n; // sq = 9*9 = 81
		int sum =0;
		while(sq > 0 ) // 8 >0
		{
			int rem = sq%10; // rem = 8%10 = 8
			sum = sum + rem ; // sum = 1+ 8 = 9
			sq = sq/10; // sq = 8/10 = 0
		}
		if (sum == n)
			System.out.println("Neon Number");
		else
			System.out.println("Not Neon Number");
		

	}

}
