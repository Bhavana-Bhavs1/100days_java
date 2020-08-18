package Pack1;
import java.io.*;
public class Files1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int c = 0;
		File f = new File("D:\\");
// f var holds id of d:\\ drive
		String[] s = f.list();
// enhanced for loop
		for(String s1 : s)
		{
			System.out.println(s1);
			c++;
		}
		System.out.println(" total = "+c);

	}

}
