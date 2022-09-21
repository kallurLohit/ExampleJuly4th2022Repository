package com.sgtestin.Abstract;
abstract class studentaa
{
	void Library(int cardno,int rollno)
	{
		System.out.println("card in library method:"+cardno);
		System.out.println("rollno:"+rollno);
	}
}
class studentbb extends studentaa
{
	
}

public class Instencemethodabstract {

	public static void main(String[] args) {
		studentbb hh=new studentbb();
		hh.Library(25, 78);

	}

}
