package Basic_Prgs;
import java.util.*;
public class Pos_Neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter size:");
		  int n = sc.nextInt();  // 3
		  
		  int a[] = new int[n];
		  
		  for(int i = 0; i <n ; i++)  // i is local var
		  {
			  a[i] = sc.nextInt();
		  }
		  
		  for(int i=0; i<n ; i++)
		  {
			  if(a[i] > 0)
				  System.out.println(a[i]+" is Positive");
			  else
				  System.out.println(a[i]+" is Negative");
		  }

	}

}
