package mcom.sgtesting.methodsandreturn;
class demo
{
	String name(String s)
	{
		return s;
	}
}

public class methodofmethodname {

	public static void main(String[] args) {
     demo obj1=new demo();
     String a=obj1.name("lohitkumar");
     System.out.println(a);
	}

}
