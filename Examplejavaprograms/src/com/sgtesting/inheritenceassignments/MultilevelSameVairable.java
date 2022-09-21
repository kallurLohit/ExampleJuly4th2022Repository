package com.sgtesting.inheritenceassignments;
class Roomno
{
	int roomno;
	void Roomno()

     {
		System.out.println("room no 1:"+roomno);
     }
}
class Roomno2 extends Roomno
{
	int roomno;
	void Roomno2()

{
		super.roomno=25;
		System.out.println("room no 2:"+roomno);
   }
}
class Roomno3 extends Roomno2
{
	int roomno;
	Roomno3()
	{
		super.roomno=45;
	}
	void Roomno3(int h)
	{
		roomno=h;
		System.out.println("Room no 3:"+h);
	}
}

public class MultilevelSameVairable {

	public static void main(String[] args) {
		Roomno3 hat=new Roomno3();
		hat.Roomno3(35);
		hat.Roomno2();
		hat.Roomno();

		
	}

}
