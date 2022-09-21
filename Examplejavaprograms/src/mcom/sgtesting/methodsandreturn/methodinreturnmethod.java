package mcom.sgtesting.methodsandreturn;
class method1
{
	String[] getarray()
	{
		String s[]={"santosh","tiger","lohitkumar","lion"};
		return s;
	}
}

public class methodinreturnmethod {

	public static void main(String[] args) {
          method1 obj1=new method1();
          String d[]=obj1.getarray();
          for(String kk:d)
          {
        	  System.out.println(kk);
          }
	}

}
