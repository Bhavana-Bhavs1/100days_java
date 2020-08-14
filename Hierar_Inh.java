package Pack1;
class Student2
{
	String name;
	int roll;
    Student2(String name , int rollno)  // constructor
    {
    	this.name = name;
    	roll = rollno;
    }
    void showStudent2()
    {
    	System.out.println("name = "+name+ " roll = "+roll);
    }
}

class Marks2 extends Student2
{
	int m1, m2;
	Marks2(String name,int rn,int m1,int m2)
	{
	  super(name,rn);
	  this.m1 = m1;
	  this.m2 = m2;
	}
	void showmarks()
	{
		System.out.println("m1 = "+m1+ " m2 = "+m2);
	}
}

class Result extends Student2
{
	int m3, m4;
	Result(String name,int rn, int m3,int m4)
	{
	  super(name,rn);
	  this.m3 = m3;
	  this.m4 = m4;
	}
	void showResult()
	{
		System.out.println("m3 = "+m3+ " m4 = "+m4);
	}
}
public class Hierar_Inh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Marks2 obj = new Marks2("sai",11,56,67);
	       obj.showStudent2();
	       obj.showmarks();
	       Result obj2 = new Result("sai",11,78,89);
	       obj2.showStudent2();
	       obj2.showResult();

	}

}
