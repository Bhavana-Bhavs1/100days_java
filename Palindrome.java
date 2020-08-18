package Basic_Prgs;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter size :");
		int s = sc.nextInt();  // 2
		int n[] = new int[s];
		int r, sum, temp;
		System.out.println("enter "+s+ " numbers :");
		for(int i=0; i<s; i++)
		{
			n[i] = sc.nextInt();   // 12321   12345
		}	
		for(int i=0;i<s; i++)
		{
			sum =0; 
			temp = n[i];  // 12345
			
			while(n[i]>0) // .1 > 0
			{
				r = n[i]%10;  // 1%10 = 1(remainder)
				sum = (sum*10)+r;  // (1232*10)+1 = 12321
				n[i] = n[i]/10;  //(quotient)
			}
				if (temp == sum)			
					System.out.println(temp + " is Palindrome");
					else
					System.out.println(temp + " is Not palindrome");
		}	

	}

}
