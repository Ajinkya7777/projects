package test;

public class Sum {
	public int add(int a,int b) {
		return a+b;
	}
	
	public int product(int a,int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
	   int add = new Sum().add(5, 4);
	   System.out.println(add);
	}
}
