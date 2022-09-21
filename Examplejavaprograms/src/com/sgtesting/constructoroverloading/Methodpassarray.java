package com.sgtesting.constructoroverloading;
class Character2
{
	void Characterarry2(char a[][])
	{
		char d[]=new char[a.length*a[0].length];
		int k=0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				d[k]=a[i][j];
				k++;
			}
		}
			for(int z=d.length-1;z>=0;z--)
			{
				System.out.println(d[z]);
			}
		}
	}


public class Methodpassarray {

	public static void main(String[] args) {
		Character2 array=new Character2();
		char c[][]= {{'b','c','d'},{'e','f','g'}};
		array.Characterarry2(c);

	}

}
