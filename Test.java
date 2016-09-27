package 作业;

class B {
	int b;
	B(int x){
		b = x;
		System.out.println("b="+b);
	}
}

class A extends B { 
	int a;
	A(int x,int y){
		super(x);
		a = y;
		System.out.println("b="+b+",a="+a);
	}
}

public class Test {
	public static void main(String[] args){
		A obj = new A(1,2);
		
		int i = 1;
		int p = 1;
		for(i = 1; i <= 10;i++){
			p*= i; 
		}
	}
}
