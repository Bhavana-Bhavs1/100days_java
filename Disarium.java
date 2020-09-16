package Progs_6;
import java.util.*;
public class Disarium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int num = sc.nextInt(); // num = 135
		int n = num; // n =135
		int len = count(num);// len = 3
		int sum =0;
		// sum of digits powered with their pos
		while(num>0)  // 0>0 -> f
		{
			int rem = num%10; // 1%10 = 1
			sum = sum + (int)Math.pow(rem, len);// sum=134+1=135
			num = num/10; // num = 1/10 = 0
			len-- ; // len = 0
		}
		if(sum==n)
			System.out.println(n+" is Disarium Number");
		else
			System.out.println(n+" is Not Disarium Number");
	}
   static int count(int n)
   {
	   int length = 0;
	   while(n !=0 ) // 1 != 0 -> t
	   {
		   length = length + 1;//length = 3
		   n = n/10; // n= 1/10 = 0
	   }
	   return length; // length = 3

	}

}
