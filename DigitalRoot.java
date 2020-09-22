package Progs_6;
import java.util.*;
public class DigitalRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		//System.out.println("enter number");
		int n = sc.nextInt(); // n = 99999
		 int root = 0;
		 
		 while(n>0 || root > 9) //0>0 ||  9>9  -> f
		 {
			 if(n==0) // -> t
			 {
				 n = root; // n =45
				 root =0; 
			 }
			 int rem = n%10; // rem = 4%10 = 4
			 root = root + rem; // root =5+4 = 9
			 n=n/10 ; // n= 4/10 =0			 
		 }
System.out.println(root);

	}

}
