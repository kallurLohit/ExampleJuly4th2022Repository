package com.sgtesting.inheritenceassignments;
class A
{
	String State;
	void showA()
	{
		System.out.println("state in class a:"+State);
	}
}
class B extends A
{
	String State;
	B(String StateA,String StateB)
	{
		super.State=StateA;
		State=StateB;
	}
	void showB()
	{
		System.out.println("state in class B:"+State);
	}
}
class C extends B
{
	String State;
	C(String StateA,String StateB,String StateC)
	{
		super(StateA,StateB);
		State=StateC;
	}
	void showC()
	{
		System.out.println("state in class C:"+State);
	}
	
}


public class multilevelinheritencesamevariuables {

	public static void main(String[] args) {
     C o=new C("karnataka","kerala","tamilanadu");
     o.showA();
     o.showB();
     o.showC();
	}

}
