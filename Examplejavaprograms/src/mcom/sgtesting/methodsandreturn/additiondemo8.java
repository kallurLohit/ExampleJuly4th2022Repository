package mcom.sgtesting.methodsandreturn;
class addition8
{
	int[][] addition(int a[][],int b[][])
	{
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[0].length-1;j++)
			{
			    c[i][j]=a[i][j]+b[i][j];				
			}
		}
		return c;
	}
}

public class additiondemo8 {

	public static void main(String[] args) {
		addition8 obj1=new addition8();
		int a[][]= {{2,3,4,},{5,7,9}};
		int b[][]= {{10,20,30},{40,50,60}};
		int e[][]=obj1.addition(a,b);
		for(int kk[]:e)
		{
			for(int zz:kk)
			{
				System.out.print(zz+" ");
			}
			System.out.println();
		}

	}

}
