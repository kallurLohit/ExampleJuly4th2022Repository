package mcom.sgtesting.methodsandreturn;
class method7
{
    int factorial(int num)
    {
    	int fac=1;
    	for(int i=num;i>=1;i--)
    	{
    		fac=fac*i;
    	}
    	return fac;
    }
}

public class factorialdemo {

	public static void main(String[] args) {
        method7 obj1=new method7();
        int b=obj1.factorial(5);
        System.out.println(b);
	}

}
