package Progs_2;
import java.util.*;
public class Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner (System.in);
		  System.out.println("enter 2 numbers:");
		  int n1 = sc.nextInt(); // 11
		  int n2 = sc.nextInt();  // 20
		  String p="";
		  for(int i = n1+1; i < n2 ; i++ )  // i = 12
		  {
			  int c = 0;
			  for(int n=i ; n>= 1; n--)  // n=10 ... 1
			  {
				  if (i%n ==0)  // 11%1 ==0 -> t
				   { c= c+1; }  // c = 2
			  }  
			  if(c==2)
				  p = p + i + " ";
			  
		   }
		  System.out.println(p);

	}

}
