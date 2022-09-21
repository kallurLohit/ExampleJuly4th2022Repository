package mcom.sgtesting.methodsandreturn;
class method6
{
	void elements()
	{
		String s[]= {"mon","tue","wed","thu","frid","sat"};
		for(int i=0;i<=s.length-1;i++)
		{
			System.out.println(s[i]);
		}
		
	}
}

public class voidmethod {

	public static void main(String[] args) {
        method6 obj1=new method6();
        obj1.elements();
	}

}
