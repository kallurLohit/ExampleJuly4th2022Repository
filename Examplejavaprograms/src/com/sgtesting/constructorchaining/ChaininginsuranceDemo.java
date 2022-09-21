package com.sgtesting.constructorchaining;
class Insurence1
{
	Insurence1 (String insurenceprovider)
	{
		System.out.println("insurence provider:"+insurenceprovider);
	}
	Insurence1(int insurenceid)
	{
		this("health");
		System.out.println("insurence id:"+insurenceid);
	}
}

public class ChaininginsuranceDemo {

	public static void main(String[] args) {
		Insurence1 o1=new Insurence1(20);

	}

}
