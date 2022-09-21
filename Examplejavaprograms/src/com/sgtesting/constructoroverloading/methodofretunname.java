package com.sgtesting.constructoroverloading;
class Name
{
	String Name(String myname)
	{
		return myname;
	}
}

public class methodofretunname {

	public static void main(String[] args) {
		Name LL=new Name();
		String name=LL.Name("lohitkumar");
		System.out.println(name);

	}

}
