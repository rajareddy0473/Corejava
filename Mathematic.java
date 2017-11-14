public class Mathematic 
{

  public void printTable(int n)
  {
	 for(int i=1;i<=10;i++)
	 {
		 int c=n*i;
       System.out.println(n+"*"+i+"="+c);

	 }
  }
  public void greaterOfTwoNumbers(int a,int b)
	{
	  if(a>b){
	  
	   System.out.println("a is greater tahn b");
	  }else
		  {
	  
	   System.out.println("b is greater tahn a");
	  }

	}

	public void greaterOfThreeNumbers(int a,int b,int c)
	{
      if(a>b&&a>c)
		  {
          System.out.println("a is greater than b  and c ");

		  }

		 else if(b>a&&b>c)

		  {

			  System.out.println("b is greater than a and c ");
		  }else
		      {
			  System.out.println("c is greater than a and b");
			  }





	}
  



	public static void main(String[] args) 
	{
	  Mathematic m=new Mathematic();
	 // m.printTable(3);
	 m.greaterOfTwoNumbers(10,20);
	 m.greaterOfThreeNumbers(10,20,30);
	}
}
