package day06;

public class Program1 {
           
	        public static void add(int a,int b)
			{
				System.out.println(a+b);
			}
			
			private static void sub(int a,int b)
			{
				System.out.println(a-b);
			}
			
			protected static void mul(int a,int b)
			{
				System.out.println(a*b);
			}
			
			static void div(int a,int b)
			{
				System.out.println(a/b);
			}

			
			public static void main(String[] args) {
				add(10,20);
				sub(20,10);
				mul(25,25);
				div(10,3);
			}


	}

