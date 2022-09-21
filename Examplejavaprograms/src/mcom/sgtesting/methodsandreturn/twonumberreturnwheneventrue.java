package mcom.sgtesting.methodsandreturn;
class method3
{
	boolean value(int x,int y)
	{
	   boolean c = false;
	   int sum=x+y;
		{
			if(sum%2==0)
			{
				c= true;
			}
		}
		return c;
	}
}

public class twonumberreturnwheneventrue {
	public static void main(String[] args) {
		method3 obj1=new method3();
		boolean d=obj1.value(20 , 400);
		System.out.println(d);
	}

}
