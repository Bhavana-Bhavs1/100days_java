package Progs_2;
import java.util.*;
public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num = sc.nextInt();  //1234
		int rev=0;
		
		while(num != 0)  // 0
		{
			int d = num%10;  // 1 (rem) // last digit of a number
			rev = rev*10 + d;  // 432*10 + 1 = 4321  //first digit in rev var
			num = num /10; // 1/10 = 0(quo) omitting last digits from num var
		}
		System.out.println("reverse number = "+ rev);	

	}

}
