package com.sgtesting.constructorchaining;
class Basicmathematics1
{
	Basicmathematics1(String firstname)
	{
		this(450);
		System.out.println("first name:"+firstname);
	}
	Basicmathematics1(int cost)
	{
	 System.out.println("cost:"+cost);
	}
	
}

public class ChainingbasicMathematicsDemo {

	public static void main(String[] args) {
		Basicmathematics1 o1=new Basicmathematics1("algoritim");

	}

}
