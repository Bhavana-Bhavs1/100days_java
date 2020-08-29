package Progs_2;
import java.util.*;
public class MegaPrime {

	  int isPrime(int n)  // n = 53
	  {
		  int i=0,flag=0;  // prime
		  if(n==1)   // 53 ==1 -> f
			  return 0;  
		  else
		  {
			  int t = (int)Math.sqrt(n);   // t=7
			  for(i=2; i<=t;i++)
			  {
				  if((n%i) == 0)  // 53%2 == 0 -> f
				  {
					  flag = 1;  // not prime
					  break;
				  }				  
			  }
		  }
		  if(flag ==1)
		   return 0;  // not prime
		  else
			return 1;  
	   }
		
		
	  int isMegaPrime(int n)  // n = 53
	  {
		  int i=0, flag = 0, temp = 0;
		  if(isPrime(n)==0)  // n = 53 prime , (1==0) -> f
			  return 0; // n = not prime
		  else
		  {
			  while(n != 0)  // 53 != 0 -> t
			  {
				  temp = n%10;  // temp = 53%10 -> 3(rem)
				  flag = isPrime(temp);  // flag = 1
				    if(flag ==0)  //  1==0 -> f
				      return 0;  // not prime
				    n = n/10;  // n = 53/10 = 5(quot)
			  }
		    }
		  if( flag == 1) //mega prime
			  return 1;
		  else
			  return 0; // not mega prime
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter number :");
		  int a = sc.nextInt();  // a = 53
		  
		  MegaPrime obj = new MegaPrime();
		  int n = obj.isMegaPrime(a);  // n = 1
		  if(n==1 ) // n = 1,  1 == 1  -> t
			  System.out.println("Mega prime number = "+ a);
		  else   // n = 0
			  System.out.println("Not mega prime number = "+ a);  

	}

}
