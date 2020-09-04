package Progs_5;
import java.util.*;
class Strong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner (System.in);
		System.out.println("enter number :");
		int n = obj.nextInt(); // 145
		int fact, rem, sum = 0, temp;
		temp = n;  // temp =145
		// this loop is to identify each digit
		while(n != 0)  // n = 0 != 0 -> false
		{
			fact = 1;
			int i = 1;
			rem = n%10;  // rem = 1%10 = 1
		   // below loop is for each digit factorial	
			while(i <= rem)  // 1 < = 1 -> true
			{
				fact = fact * i;
				i++;
			}
			sum = sum + fact ; // sum = 144+1 = 145	
			n = n/10;  // n = 1/10 = 0
		}
         if ( sum == temp) // 145 = 145 -> true
        	 System.out.println(temp + " is a Strong Number" );
         else
        	System.out.println(temp + " is not a Strong Number"); 


	}

}
