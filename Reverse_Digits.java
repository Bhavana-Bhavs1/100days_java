package Progs_3;
import java.util.*;
public class Reverse_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number");
		int n = obj.nextInt(); // n = 12345
		int fdigit, ldigit, digits, rev_num;
		
		ldigit = n%10;  // ldigit = 12345%10 = 5  (no of digits)
		
		digits = (int)Math.log10(n) ; // no of digits-1  = 4  
	     
		fdigit = (int)(n/Math.pow(10,digits)); 	// fdigit = 12345/10000 = 1
		
		rev_num = ldigit;  // rev_num = 5
		rev_num = rev_num * (int)(Math.pow(10, digits)); //5* 10000 = 50000
		
		rev_num = rev_num + n %(int)(Math.pow(10,digits));
		// rev_num = 50000 +(12345%10000) = 50000+2345 = 52345
		
		rev_num = rev_num - ldigit; // rev_num = 52345 - 5 =  52340
		
		rev_num = rev_num + fdigit; // rev_num = 52340 + 1 = 52341
		
		System.out.println("Reverse digit number = "+  rev_num);
		

	}

}
