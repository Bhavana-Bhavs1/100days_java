package Progs_3;
import java.util.*;
public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner obj = new Scanner(System.in);
		  System.out.println("enter 2 numbers:");
		  int s = obj.nextInt();  // s = 15
		  int n = obj.nextInt(); // n = 120
		  System.out.println("Multiples of 3 and 5 are:");
		  for(int i = s; i<= n ; i++)
		  {
			  if(i%3==0 && i%5 == 0)
				  System.out.print(i +" ");
		  }

	}

}
