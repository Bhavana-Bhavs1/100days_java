package Pack1;
class Student
{
	String name;
	int roll_no;
	
	Student(String name, int roll_no)
	{
		this.name = name;
		this.roll_no = roll_no;
	}
	public void printStudent()
	{
		System.out.println(name);
		System.out.println(roll_no);
	}	
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      Student s1 = new Student("suresh",10);
		      s1.printStudent();

	}

}
