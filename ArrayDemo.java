
import java.util.Random;
class Test
{
	 public void print(int[] array)
	{

		for (int i=0;i<array.length;i++)
		{
			System.out.print(array[i] +" ");
		}
	}


    public void printArray(int[] array)
	{

		for (int i=0;i<array.length;i++)
		{
			for (int c=i+1;c<array.length ;c++ )
			{
				if (array[i]==array[c])
				{
					System.out.println(array[i]+"  "+array[c]);
			    }
			}
		}
	}


	 public void addArray(int[] array)
	 {
        int sum=0;
		 for (int i=0;i<array.length ;i++ )
         {
			sum=array[i]+sum;
		  }
		  System.out.println(sum);
	  }
}

class ArrayDemo 
{
	public static void main(String[] args) 
	
	
     {
		 Random r=new Random();
		int[] array=new int[15];
		for (int i=0;i<array.length ;i++ )
        {

                array[i]=r.nextInt()%5+5;
		 }


		  Test t=new Test();
		  t.print(array);
		  System.out.println("*********************************************");
		   t.printArray(array);
		   System.out.println("*********************************************");

		  t.addArray(array);
		    //System.out.println(-105%6);

	}
}
