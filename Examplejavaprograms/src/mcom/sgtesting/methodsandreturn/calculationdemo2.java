package mcom.sgtesting.methodsandreturn;
class caluculation2
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println("addition:"+res);
	}
	void multipication(int x,int y)
	{
		int res=x*y;
		System.out.println("multipication:"+res);
	}
}

public class calculationdemo2 {

	public static void main(String[] args) {
		caluculation2 obj1=new caluculation2();
		obj1.addition(20, 30);
		obj1.multipication(10, 20);
		caluculation2 obj2=new caluculation2();
		obj2.addition(15, 20);
		obj2.multipication(30, 40);
	}

}
