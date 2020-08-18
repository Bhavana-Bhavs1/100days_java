package Basic_Prgs;
import java.util.*;
public class Fibo_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();  // 10	
		int t1 = 0, t2 =1;
		System.out.println("Fibonacci Series:");
		
		for(int i = 1; i <= n ; i++)
		{
			int sum = t1 + t2;  //0+1 = 1
			t1 = t2; // t1 = 1
			t2 = sum;  // t2 =1 
			//System.out.print(sum+" ");
			if(t1>0)
			{
				if(t1%2==0 && t1<n)
					System.out.print(t1+" ");
			}
		}	

	}

}
