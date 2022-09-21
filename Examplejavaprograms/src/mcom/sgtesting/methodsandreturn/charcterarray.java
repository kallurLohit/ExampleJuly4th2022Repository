package mcom.sgtesting.methodsandreturn;
class Program
{
	int[] array(int a[][])
	{
	   int c[]=new int[a.length*a[0].length];
	   int k=0;
	   for(int i=0;i<=a.length-1;i++)
	   {
       for(int j=0;j<=a[0].length-1;j++)
       {
    	   c[k]=a[i][j];
    	   k++;
       }
    }
	   return c;
	   
	}
	
	
}


public class charcterarray {

	public static void main(String[] args) {
        Program obj1=new Program();
        int a[][]= {{2,3,4,5,6},{12,13,14,15,16}};
        int z[]=obj1.array(a);
        for(int kk:z)
        {
        	System.out.println(kk);
        }
	}

}
