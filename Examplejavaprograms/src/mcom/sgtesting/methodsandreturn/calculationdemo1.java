package mcom.sgtesting.methodsandreturn;
class Caluculation1
{
	void addition()
	{
		int res,x,y;
		x=25;y=55;
		res=x+y;
		System.out.println("result addition:"+res);
	}
	void multipication()
	{
		int res,x,y;
		x=20;y=10;
		res=x*y;
		System.out.println("multipication:"+res);
	}
}

public class calculationdemo1 {

	public static void main(String[] args) {
		Caluculation1 obj1=new Caluculation1();
		obj1.addition();
		obj1.multipication();
		Caluculation1 obj2=new Caluculation1();
		obj2.addition();
		obj2.multipication();
	}

}
