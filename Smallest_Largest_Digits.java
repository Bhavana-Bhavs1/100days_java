package Progs_3;
import java.util.*;
public class Smallest_Largest_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter number :");
		int num = sc.nextInt(); //num = 345654
		int snum,lnum,rem;
		snum = lnum = num%10;  // snum = lnum = 4
		
		while(num>0) // 3 > 0 -> t
		{
		  	rem = num%10 ;   // rem = 3%10 = 3
		  	num = num/10 ;  //num = 0
		  	if(rem > lnum)  // 3 > 6 -> f
		  	{
		  		lnum = rem;		// lnum = 6  		
		  	}
		  	else if(rem <= snum) // 3 <= 4  -> t
		  	{
		  		snum = rem; // snum = 3
		  	}
		}
		
		System.out.println("smallest digit = "+ snum);
		System.out.println("largest digit = "+ lnum);

	}

}
