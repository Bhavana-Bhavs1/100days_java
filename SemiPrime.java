package Progs_2;
import java.util.*;
public class SemiPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter number:");
		  int num = sc.nextInt();  //  8
		  int x=num;
		  int c=0;
		  for (int i = 2; c < 2 && i*i <= num; i++)  // 3<2 and 3*3<=8 -> f
		  {
			  while(num%i == 0)  //  1%2 == 0(rem)-> f
			  {
				  num = num/i;  // 2/2 = 1 (quotient)
				  ++c;  //  c=3  (because of 2,2,2)
			  }
		  }	  
		 if(num>1)  // 1>1  -> f
		 {
			 ++c;  // c = 2  (because of 3)
		 }	 
		 if(c == 2)  // 3 == 2 -> f
			 System.out.println("semiprime number = "+ x);
		 else
			 System.out.println("not a  semiprime number = "+x);

	}

}
