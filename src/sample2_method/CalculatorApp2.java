package sample2_method;

public class CalculatorApp2 {
	
	public static void main(String[] args) {
		

	Calculator cal = new Calculator();
	
	int result1 = cal.plus(10, 10);
	System.out.println("덧셈결과: " + result1);
	double result2 = cal.plus(2.4, 5.0);
	System.out.println(result2);
	
	}
}
