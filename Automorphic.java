package Progs_6;
import java.util.*;
public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt(); // n = 5
		int x = 0;
		
		int sq = n*n; // sq = 25
		
		while(n>0)  // 0 > 0 -> false
		{
			if(n%10 != sq%10)  // 5%10= 5  != 25%10= 5 -> false
			{
				x = 1;
				break;
			}
			n= n/10; //  n= 5/10 = 0
			sq = sq/10; // 25 /10 = 2
		}
		if(x==0) // 0==0 -> true
			System.out.println("Automorphic Number");
		else
			System.out.println("Not Automorphic Number");
	

	}

}
