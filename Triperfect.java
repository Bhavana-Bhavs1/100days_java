package Progs_6;
import java.util.*;
public class Triperfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("enter Number :");
		int n = sc.nextInt();  // n= 120
		
		int sum = 1+n; //sum = 121
		
		int i = 2;
		//finding all divisors
		while( i*i <= n) // condition for true
		// 2*2 <= 120 -> t, 3*3 <= 120 -> t ,4*4 <= 120 ->t
			//5*5 <= 120 -> t, 6*6 <= 120-> t, 7*7 <= 120->t
	// 8*8 <= 120->t, 9*9 <= 120 -> t, 10*10 <= 120 -> t, 11*11 <=120 -> f
		{
			if(n%i == 0 )
			// 120%2 == 0 -> t , 120%3 == 0 -> t, 120%4 == 0 -> t
				//120%5 == 0 ->t, 120%6 == 0 ->t, 120%7 == 0 -> f
				//120%8 == 0 ->t, 120%9 == 0 -> f, 120%10 == 0 -> t
			{
				if(n/i==i) 
		// 120/2 == 2 -> f, 120/3 == 3 -> f, 120/4 == 4 -> f
					//120/5 == 5 -> f, 120/6 == 6 -> f, 120/8 ==8 -> f
					//120/10 == 10 -> f
					sum = sum +i;  // na
				else
					sum = sum + i + n/i;
				// sum = 121 + 2 + 120/2 = 60 -> 183
				// sum = 183 + 3 + 120/3 = 40 -> 226
				// sum = 226 + 4 + 120/4 = 30 -> 260
				// sum = 260 + 5 + 120/5 = 24 -> 289
				// sum = 289 + 6 + 120/6 = 20 -> 315
				// sum = 315 + 8 + 120/8 = 15 -> 338
				// sum = 338 + 10 + 120/10 = 12 -> 360
				
		    }
		i = i+1; // i = 11		
		} // end of while loop
			
	if(sum == 3*n)
	System.out.println(n + " is Triperfect Number");
	else
		System.out.println(n+" is Not Triperfect Number");
		

	}

}
