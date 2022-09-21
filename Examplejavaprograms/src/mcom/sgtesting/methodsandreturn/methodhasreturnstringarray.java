package mcom.sgtesting.methodsandreturn;
class method5
{
	String[] elements()
	{
		String s[]= {"ran","man","tan"};
		return s;
	}
}

public class methodhasreturnstringarray {

	public static void main(String[] args) {
		method5 obj1=new method5();
		String d[]=obj1.elements();
		for(String kk:d)
		{
			System.out.println(kk);
		}

	}

}
