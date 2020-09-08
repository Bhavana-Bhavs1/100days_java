package Progs_5;
import java.util.*;
public class Harshad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number ");
		int n = sc.nextInt(); //n = 18
		int sum =0;
		int c=n; // c = 18
		while(c>0) // 0>0 - > false
		{
		     int rem = c%10 ; // 1%10 = 1
		     sum = sum + rem ; // sum  8 + 1 = 9
		     c= c/10 ; // c= 1/10 = 0
		}
		if(n%sum==0) // 18%9 ==0 -> true
		System.out.println("Harshad Number");
		else
		System.out.println("Not Harshad Number");

	}

}
