package day01;

public class Program1 {

	public static void main(String[]args){
		add(48,66);
		add(184,46);
		add(415.05f,26.30334f);
		add(231,342.54);
		
	} 
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(double a,double b)
	{
		System.out.println(a+b);
	}
	public static void add(float a,float b)
	{
		System.out.println(a+b);
	}
	
	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
}
