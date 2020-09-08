package Progs_5;
import java.util.*;
public class Ugly {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number :");
			int n = sc.nextInt(); // 18
			int x=0; // ugly number
			 
			while(n != 1) // 1 != 1 -> false
			{
				if(n%5==0) // 18%5 == 0 
		         		n = n/5;			
				else if(n%3==0)// 18%3== 0
				n=n/3 ; // n = 18/3 = 6
				else if(n%2==0) // 18%2
				n = n/2;
				else
				{ 
				x= 1;
				break;
				}
			}
			 if(x==0)
				 System.out.println(" Ugly Number");
			 else
				 System.out.println("Not Ugly Number");

	}

}
