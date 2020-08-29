package Basic_Prgs;
import java.util.*;
public class Ohms_Law {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner obj = new Scanner(System.in);
		  String ch;
		  float voltage, current, resistance, result;
		  System.out.println("Ohms Law:");
		  System.out.println("---------");
		  System.out.println("1.calculate voltage");
		  System.out.println("2.calculate current");
		  System.out.println("3.calculate resistance");
		  
		  System.out.println("enter choice[1,2,3] :");
		  ch = obj.next();
		  
		  switch(ch)
		  {
		  case "1": 
			  System.out.println("enter current value:");
			  current = obj.nextFloat();
			  System.out.println("enter resistance value:");
			  resistance = obj.nextFloat();
			  result = current * resistance;
			  System.out.println("voltage = "+result);
			  break;
		  case "2":
			  System.out.println("enter voltage:");
			  voltage = obj.nextFloat();
			  System.out.println("enter resistance");
			  resistance = obj.nextFloat();
			  result = voltage/resistance;
			  System.out.println("current = "+result);
			  break;
		  case "3":
			  System.out.println("enter current :");
			  current = obj.nextFloat();
			  System.out.println("enter voltage :");
			  voltage = obj.nextFloat();
			  result = voltage/current;
			  System.out.println("resistance = "+result);
			  break;	  
	}

}
}
