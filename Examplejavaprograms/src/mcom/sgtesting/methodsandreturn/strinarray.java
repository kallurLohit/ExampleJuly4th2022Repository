package mcom.sgtesting.methodsandreturn;
class String1
{
	String getname(String fname,String iname)
	{
		String s=fname+" "+iname;
		return s;
	}
}

public class strinarray {

	public static void main(String[] args) {
       String1 obj1=new String1();
       String a=obj1.getname("santosh", "gudi");
       System.out.println(a);
       
	}

}
