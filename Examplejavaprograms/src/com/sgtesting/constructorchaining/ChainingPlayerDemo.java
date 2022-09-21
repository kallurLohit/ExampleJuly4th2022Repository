package com.sgtesting.constructorchaining;
class Players1
{
	Players1 (String firstname)
	{
		System.out.println("First name:"+firstname);	
	}
	Players1 (int idno)
	{
		this("virat kohli");
		System.out.println("idno:"+idno);
	}
	Players1 (String cityname,int noofplayers)
	{
		System.out.println("cityname:"+cityname+"number of players:"+noofplayers);
		
	}
}

public class ChainingPlayerDemo {

	public static void main(String[] args) {
		Players1 o1=new Players1(50);
		Players1 o2=new Players1("banglore",12);

	}

}
