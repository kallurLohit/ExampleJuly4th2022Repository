package mcom.sgtesting.methodsandreturn;
class SumNumber
{
	int numbers()
	{
		int sum=0;
		for(int i=1;i<=20;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}

public class sumofnumber {

	public static void main(String[] args) {
		SumNumber obj1=new SumNumber();
		int b=obj1.numbers();
		System.out.println(b);

	}

}
