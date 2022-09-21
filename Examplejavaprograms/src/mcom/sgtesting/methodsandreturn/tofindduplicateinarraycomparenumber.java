package mcom.sgtesting.methodsandreturn;
class Method4
{
	void array(int a[],int num)
	{
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==num)
			{
				System.out.println("duplicate found");
				break;
			}
		}
	}
}

public class tofindduplicateinarraycomparenumber {

	public static void main(String[] args) {
        Method4 obj1=new Method4();
        int a[]= {2,3,4,5,6,7};
        obj1.array(a,9);
        
	}

}
