	package com.sgtestin.Abstract;
	abstract class Employeaa
	{
		void company(int companyno,int id)
		{
			System.out.println("cardno in library method:"+companyno);
			System.out.println("roll no:"+id);
		}
	}
	class Employebb extends Employeaa
	{
		
	}
	
	public class Parameterisedabstract {
	
		public static void main(String[] args) {
			Employebb hh=new Employebb();
			hh.company(25,78);
	       
		}
	
	}
