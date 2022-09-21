
public class stringtopicpractice {

	public static void main(String[] args) {
		Strlength();
		isemptyString();
		isLowercaseString();
		isuppercases();
		extractString();
		replaceString();
		splitString();
		getchararray();
		compareString();
		 compareString1();
		 existanceofString();
		 findposition();
		 convertintootherdatatype();
		

	}
	private static void Strlength()
	{
		String str="programming";
		System.out.println("number of chars:"+str.length());
		System.out.println("+++++++++++++++++++++++++");
	}
	private static void isemptyString()
	{
		String s=new String();
		System.out.println("it is an empty String?:"+s.isEmpty());
		System.out.println("++++++++++++++++++++++");
	}
	private static void isLowercaseString()
	{
		String s=new String("PROGRAMMING");
		System.out.println("it is lowercase?:"+s.toLowerCase());
		System.out.println("+++++++++++++++");
	}
	private static void isuppercases()
	{
		String s=new String("programming");
		System.out.println("it is uppercase?:"+s.toUpperCase());
		System.out.println("+++++++++++++++++++");
	}
	private static void extractString()
	{
		String s=new String("programmming");
		System.out.println("extract1:"+s.substring(3));
		System.out.println("extract2:"+s.substring(3, 8));
		System.out.println("++++++++++++++++++");
	}
	private static void replaceString()
	{
		String s=new String("it is a new string");
		System.out.println("replaced String:"+s.replace("new", "latest"));
		System.out.println("+++++++++++++++++");
	}
	private static void splitString()
	{
		String s=new String("Banglore and mysore");
		String s1[]=s.split(" ");
		for(String kk:s1)
		{
			System.out.println(kk);
		}
		System.out.println("++++++++++++++++");
	}
	private static void getchararray()
	{
		String s=new String("wellcome");
		char ch[]=s.toCharArray();
		for(char kk:ch)
		{
			System.out.println(kk+" ");
		}
		System.out.println("+++++++++++++++++++++");
	}
	private static void compareString()
	{
		String s1="JavaScript";
		String s2="JAVASCRIPT";
		System.out.println("s1 and s2 are equal:"+s1.equals(s2));
		System.out.println("s1 and s2 are equal:"+s1.equalsIgnoreCase(s2));
		System.out.println("+++++++++++++++++++++");
	}
	private static void compareString1()
	{
		String s1="Javascript";
		String s2="JAVASCRIPT";
		System.out.println("s1 and s2 are equal:"+s1.compareTo(s2));
		System.out.println("s1 and s2 are equal:"+s1.compareToIgnoreCase(s2));
		System.out.println("++++++++++++++++++++++++");
	}
	private static void existanceofString()
	{
		String s=new String("Banglore and Mysore");
		System.out.println("starts_with:"+s.startsWith("Banglore"));
		System.out.println("Ends_with:"+s.endsWith("Mysore"));
		System.out.println("contains:"+s.contains("and"));
		System.out.println("++++++++++++++++++++++");
	}
	private static void findposition()
	{
		String s=new String("Banglore and Mysore");
		System.out.println("postion1:"+s.indexOf("and"));
		System.out.println("postion2:"+s.indexOf("Mysore"));
		System.out.println("+++++++++++++++++++++++");
	}
	private static void convertintootherdatatype()
	{
		int a=125;
		String s1=String.valueOf(a);
		System.out.println(s1);
		double d=17.25;
		String s2=String.valueOf(d);
		System.out.println(s2);
	}
   

}
