

class Student
{
	private int rollNumber;
	private String name;


	public void setNumber(int x)
	{
		rollNumber=x;
	}
	public void setName(String y)
	{
		name=y;
	}
	
	public int getNumber()
	{
		return rollNumber;
	}

	public String getName()
	{
		return name;
	}
}



class  ClassDemo1
{
	public static void main(String[] args) 
	{
		Student s1=new  Student();
		
		s1.setNumber(20);
		s1.setName("Vinod");

		System.out.println("roll number= "+s1.getNumber());
		System.out.println("name = "+s1.getName());

		
	}
}








class DetailClass
{
	public void displayDetail(Student student)
	{
		System.out.println("Student Name = "+student.getName());
		//student.rollNumber=300;
		//System.out.println("roll Number = "+student.rollNumber);
	}
}








	