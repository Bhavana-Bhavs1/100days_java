package Pack1;
import java.io.*;
public class Files2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("d:\\File1.txt",true);
		System.out.println("file is created");
		fw.write("java class");
		fw.write(" 100days");
		fw.flush();
		fw.close();

	}

}
