package com.sgtesting.constructorchaining;
class Animals1
{
	Animals1(String firstname)
	{
		System.out.println("first name:"+firstname);
	}
	Animals1(int cost)
	{
		this("cow");
		System.out.println("cost:"+cost);
	}
}

public class ChainigAnimalsDemo {

	public static void main(String[] args) {
		Animals1 o1=new Animals1(40000);

	}

}
