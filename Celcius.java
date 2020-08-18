package Basic_Prgs;
import java.util.*;
public class Celcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  float f,c;
		  System.out.println("enter Celsius temperature:");
		  c = sc.nextFloat();
		  f = ((c*9)/5)+32;
		  System.out.println("Farenheit = "+f);

	}

}
