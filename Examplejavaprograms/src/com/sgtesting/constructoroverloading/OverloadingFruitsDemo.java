package com.sgtesting.constructoroverloading;
class Fruits
{
	Fruits(String Fname,int cost)
	{
		System.out.println("fruit name:"+Fname);
		System.out.println("cost:"+cost);
	}
	Fruits(String Sname)
	{
		System.out.println("shopname:"+Sname);
	}
	Fruits(int number)
	{
		System.out.println("numberof fruits:"+number);
	}
}

public class OverloadingFruitsDemo {

	public static void main(String[] args) {
		Fruits o1=new Fruits("orange",20);
		Fruits o2=new Fruits("santosh");
		Fruits o3=new Fruits(2000);

	}

}
