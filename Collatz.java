package Progs_5;
import java.util.*;
public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int n = sc.nextInt(); // n=6
		int even = n/2;
		int odd = (3*n)+1;
		
		while(n != 1) // 3 != 1 -> true
		{
			if (n%2==0) // 3%2 == 0  -> false
			{
			System.out.print(n+ " ");  // 6
			even = n/2;  // even = 6/2 = 3
			n = even; // n = 3
			}
			else if (n%2 != 0)  // 3%2 != 0 -> true
			{
				System.out.print(n+" "); // 3
				odd = (3*n)+1; // odd = 10
				n = odd;
			}
		}
		System.out.print(n);

	}

}
