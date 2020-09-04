package Progs_5;
import java.util.*;
public class Spy_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number :");
		int n = sc.nextInt(); // n = 132
		int num = n; // num = 132
		int sum =0, mul = 1;
		while(num > 0 ) // 0 > 0 -> false
		{
			int r = num%10;  // r = 1%10 = 1
			sum = sum+ r;  //sum = 5+1= 6
			mul = mul *r ;  // mul =6*1 = 6
			num = num/10;  // num = 1/10 = 0
		}
       if (mul == sum)
    	   System.out.println (n + " is a Spy Number");
       else
    	   System.out.println(n + " is not a Spy Number");

	}

}
