class Student
{
	public int rollNumber;
	public String name;
}


class DetailClass
{
	public void displayDetail(Student student)
	{
		System.out.println("Student Name = "+student.name);
		System.out.println("roll Number = "+student.rollNumber);

		student.name="SACHIN";
	}
}

class  ClassDemo
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		
		s1.rollNumber=10;
		s1.name="mohan";

		System.out.println("roll number= "+s1.rollNumber);
		System.out.println("name = "+s1.name);

		System.out.println("----------------------------------");

		

		DetailClass detail= new DetailClass();
		
		detail.displayDetail(s1);

		System.out.println("----------------------------------");

		System.out.println("name = "+s1.name);

		


	}

}
