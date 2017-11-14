class Bank
{
	private String bankName;
	private String bankBranch;
	
    public void setBankName(String bankName){
		this.bankName=bankName;

    }

	public String getBankName(){

		return bankName;

		}
		public void setBankBranch(String bankBranch){
			this.bankBranch=bankBranch;
		}
		public String getBankBranch(){
			return bankBranch;
		}
}


class Employee
{
	private String employeeName;
	private Bank bank;
	private Department department;


     public void setEmployeeName(String employeeName){
	  this.employeeName=employeeName;

     }
	 public String getEmployeeName(){
		 return employeeName;
	 }
	 public void setBank(Bank bank){
		 this.bank=bank;
	 }
	 public Bank getBank(){
		 return bank;
	 }
	 public void setDepartment(Department department){
		 this.department=department;

	 }
	 public Department getDepartment(){
		 return department;
	 }

}

class Department
{
	private String departName;
	private String departmentId;

	public void setDepartName(String departName)
	{
		this.departName=departName;

	}

	public void setDepartmentId(String departmentId)
	{
		this.departmentId=departmentId;
	}
	public String getDepartName(){
		return departName;
	}
	public String getDepartmentId(){
		return departmentId;
	}

}

class Display
{
	public void display(Employee e)
	{

		System.out.println(e.getEmployeeName());
		System.out.println(e.getBank().getBankName());
		
		System.out.println(e.getBank().getBankBranch());
		System.out.println(e.getDepartment().getDepartmentId());
		System.out.println(e.getDepartment().getDepartName());
	}
}

public class  EmployeeMain
{
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.setEmployeeName("Raja");
		Bank b=new Bank();
		b.setBankName("SBI");
		b.setBankBranch("kanigiri");
		e.setBank(b);
		Department d= new Department();
		d.setDepartmentId("10");
		d.setDepartName("cse");
		e.setDepartment(d);

		Display f=new Display();
		f.display(e);
		









	}
}
