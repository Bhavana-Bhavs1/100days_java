package Basic_Prgs;
import java.util.*;
public class Even_Odd_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter size :");
		  int s = sc.nextInt();  // 8
		  int[] nums = new int[s];
		  int even=0, odd=0;
		  System.out.println("enter " + s + " values:");
		  for(int i=0; i<s ; i++)
		  {
			  nums[i] = sc.nextInt();  // 8 values(1 2 3 6 7 8 9 5)
		  }
		  
		  for(int i = 0; i<s; i++)
		  {
			  if(nums[i]%2==0)
				  even++;   // 3
			  else
				  odd++;  // 5
		  }
		  System.out.println("even number count = "+even );
		  System.out.println("odd number count = "+odd );

	}

}
