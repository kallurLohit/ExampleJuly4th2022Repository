package mcom.sgtesting.methodsandreturn;
class integer4
{
	int[] arrays(int a[])
	{
		int b[]=new int[a.length/2];
		int k=0;
		for(int i=0;i<a.length/2;i++)
		{
			b[k]=a[i];
			k++;
		}
		return b;
	}
}

public class integerarrayfirsthalf {

	public static void main(String[] args) {
       integer4 obj1=new integer4();
       int a[]= {2,3,4,5,6,7};
       int c[]=obj1.arrays(a);
       for(int kk:c)
       {
    	   System.out.println(kk);
       }
	}

}
