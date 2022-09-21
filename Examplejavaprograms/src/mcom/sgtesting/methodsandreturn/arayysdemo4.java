package mcom.sgtesting.methodsandreturn;
class Lohitkumar
{
	int [][] aryyas1(int a[])
	{
		int b[][]=new int[a.length/3][a.length/2];
	   int n=0;
		for(int i=0;i<a.length/3;i++)
		 {
			 for(int j=0;j<a.length/2;j++)
			 {
				 b[i][j]=a[n];
				         	n++;	
			 }
		 }
		return b;
	}
}

public class arayysdemo4 {

	public static void main(String[] args) {
		 Lohitkumar obj1=new  Lohitkumar();
		 int a[]= {2,3,4,5,6,67};
		 int d[][]=obj1.aryyas1(a);
		for(int z[]:d)
		{
			for(int j:z)
			{
				System.out.print(j+"   ");
			}System.out.println();
		}

	}

}
