package Pack1;
class Bank
{
	String name;
	int acc_no;
	
	Bank()
	{
		name = "suresh";
		acc_no = 10;
	}
	Bank(String name)
	{
		this.name = name;
		acc_no = 11;
	}
	Bank(String name , int acc_no)
	{
		this.name = name;
		this.acc_no = acc_no;
	}
	void showBank()
	{
System.out.println("name = "+name+"\nacc_no ="+acc_no);
	}
	
}
public class Over_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = new Bank();
		  b1.showBank();
		  Bank b2 = new Bank("naveen");
		  b2.showBank();
		  Bank b3 = new Bank("sai",12);
		  b3.showBank();

	}

}
