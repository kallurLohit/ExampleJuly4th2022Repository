package com.sgtesting.practicejavapart2;
class user1
{
	void array(char a[][])
	{
		char b[]=new char[a.length*a[0].length];
		int n=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				b[n]=a[i][j];
				n++;
			}
		}
		for(int m=b.length-1;m>=0;m--)
		{
			System.out.println(b[m]);
		}
		
			
	}
}

public class assignment37 {

	public static void main(String[] args) {
		char d[][]= {{'a','b','c'},{'e','f','g'}};
		user1 obj=new user1();
		obj.array(d);
		

	}

}
