package mcom.sgtesting.methodsandreturn;
class Divisiblenumber
{
	int divisible()
	{
		int count=0;
		for(int i=50;i<=100;i++)
		{
			if(i%6==0)
			{
				count=count+1;
			}
		}
		return count;
	}
}

public class countdivisible6 {

	public static void main(String[] args) {
		Divisiblenumber obj1=new Divisiblenumber();
		int c=obj1.divisible();
		System.out.println(c);
	}

}
