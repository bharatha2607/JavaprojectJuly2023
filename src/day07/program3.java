package day07;

public class program3 {

	public static void main(String[] args) {
		int a=102;
		int b=24;
		double c=14.2;
		
		System.out.println(a>b   && a>c);//true
		System.out.println(b>a   && b>c);//false
		
		
		System.out.println(a>b   || a>c);//true
		System.out.println(b>a   || b>c);//true
		
		System.out.println(!(a>b   && a>c));//false
		System.out.println(!(b>a   && b>c));//true
	}
	
	
	}

