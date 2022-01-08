package week3.day1;

public class Calculator {

	public void AddNumber(int a, int b) {
		int c=a+b;
		System.out.println("Sum of two no "+c);

	}
	public void AddNumber(int a, int b, int c) {
		int d=a+b;
		System.out.println("Sum of two no "+d);

	}
	public void SubNumber(int a, int b) {
		int c=a-b;
		System.out.println("Sub of two no "+c);

	}
	public void SubNumber(double a, double b) {
		double c=a-b;
		System.out.println("Sub of two no "+c);

	}
	public void Multiply(int a, int b) {
		int c=a*b;
		System.out.println("multiply of two no "+c);

	}
	public void Multiply(int a, double b) {
		double c=a*b;
		System.out.println("multiply of two no "+c);

	}
	public void Divide(int a, int b) {
		int c=a/b;
		System.out.println("Divide of two no "+c);

	}
	public void Divide(int a, double b) {
		double c=a/b;
		System.out.println("Divide of two no "+c);

	}
	
	public static void main(String[] args) {	
		
		Calculator cal = new Calculator();
		cal.AddNumber(5, 10);
		cal.AddNumber(5, 5, 5);
		cal.SubNumber(10, 7);
		cal.SubNumber(5.5, 10.5);
		cal.Multiply(5, 5);
		cal.Multiply(5, 5.5);
		cal.Divide(10, 2);
		cal.Divide(10, 5.5);
		
	}
	

}
