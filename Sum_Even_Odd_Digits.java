package Progs_3;
import java.util.*;
public class Sum_Even_Odd_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner obj = new Scanner (System.in);
		  System.out.println("enter number :");
		  int n= obj.nextInt();  // 1234
		  int even_sum =0,  odd_sum =0;
		  while(n!=0)  // 1 != 0 -> t
		  {
			  int rem = n%10;  // rem = 1%10 = 1
			  if (rem%2 == 0)  // even -> t
			    even_sum = even_sum+rem;  // even_sum = 6
			  else  // odd -> t
				  odd_sum = odd_sum + rem;   // odd_sum = 4
			  
			  n = n/10; // n = 12/10 -> 1
	  	  }
		 System.out.println("even sum = "+ even_sum);
		 System.out.println("odd sum = "+ odd_sum); 

	}

}
