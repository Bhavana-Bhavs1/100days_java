package Progs_6;
import java.util.*;
public class Happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int num = sc.nextInt(); // num = 32
		int result = num;  // result = 32
		while(result != 1 && result != 4) // result = 32, 13, 10,1 -> f
		{
			result = print(result); // 32, 13, 10
		}
		if(result ==1 )
			System.out.println(num + " is a Happy Number");
		else
			System.out.println(num+ " is Not Happy Number");
	}
	static int print(int num)
	{
		int sum = 0;
		while(num > 0) // num = 32 > 0 -> t, num =3>0 -> t
		{
			int rem = num%10; // rem= 3%10 = 3
			sum = sum + (rem*rem);  // sum = 4+ 9 = 13
			num = num/10; // num=3/10 = 0
		}
		return sum; // sum =13, 10, 1

	}

}
