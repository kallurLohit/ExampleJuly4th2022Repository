package mcom.sgtesting.methodsandreturn;
class oddnumbers
{
	int numbers1()
	{
		int count=0;
		for(int i=91;i>=31;i--)
		{
			if(i%2==1)
			{
				count=count+1;
			}
		}
		return count;
	}
}

public class countofoddnumbers {

	public static void main(String[] args) {
        oddnumbers obj1=new oddnumbers();
        int c=obj1.numbers1();
        System.out.println(c);
	}

}
