package com.sgtesting.inheritenceassignments;
class Library
{
	Library(String sname)
	{
		System.out.println("student name:"+sname);
	}
	Library(int rollno)
	{
		System.out.println("student rollno:"+rollno);
	}
	Library(String branch,int roomno)
	{
		System.out.println("name of branch:"+branch+"roomno:"+roomno);
	}
}
class Library2 extends Library
{
	Library2(String nm)
	{
		super(nm);
	}
	Library2(int k)
	{
		super(k);
	}
	Library2(String fname,String city)
	{
		super("mechanical",45);
		System.out.println("name of father:"+fname+"city name:"+city);
	}
}
class Library3 extends Library2
{
	Library3(String nm)
	{
		super(nm);
	}
	Library3(int k)
	{
		super(k);
	}
	Library3(String fn,String ci)
	{
		super(ci);
	}
}
class Library4 extends Library
{
	Library4(String nm)
	{
		super(nm);
	}
	Library4(int k)
	{
		super(k);
	}
	Library4(String br,int nn)
	{
		super(br,nn);
	}
}

public class Hybridclassinsuperclass {

	public static void main(String[] args) {
		Library3 kk=new Library3("santosh");
	    Library3 kk1=new Library3(45);
	    Library3 kk2=new Library3("Banglore","jagadeesh");
	    Library4 ss=new Library4("jaggesh");
	    Library4 ss1=new Library4(45);
	    Library4 ss2=new Library4("mech",254);
	    
				    
       
	}

}
