package Progs_5;
import java.util.*;
public class FullEven_Odd_Mixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number :");
		int num = sc.nextInt(); // num = 12345
	     print(num);
		}  // end of main()

	   static void print(int num)
	   {
		int f = 1;
		int n,d;
		n = num;  // n = 12345
		
		while(num!=0)  // num = 1234  -> true
		{ 
		  d = num%10;  // d = 4(rem) -> identify last digit
		  num = num/10;  // num = 1234/10 =  123(quo) -> omit last digit
		  
		  if(n%2 == 0 &&  d%2 == 1) // n = 12345%2 == 0 && 5%2 == 1
		  {
			  f=2;
			  break;
		  }
		  else if(n%2 == 1 && d%2 == 0) // n = 1235%2 == 1 && 4%2 == 0 -> true
		  {
			  f=2; // f becomes 2
			  break; // exits loop
		  }
		}//end of loop
		
		if(f ==1 && n%2 ==0)
			System.out.println("Full Even Number ");
		else if (f==1 && n%2==1)
			System.out.println("Full Odd Number ");
		else
			System.out.println("Mixed Number ");

	}

}
