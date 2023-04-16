package sample2_method;

public class CalculatorApp {

	public static void main(String[] args) {
		// 사칙 연산 기능이 구현된 Calculator 객체 생성하기
		Calculator calculator = new Calculator();

		// 덧셈 기능 사용하기
		int result = calculator.plus(100, 100);
		System.out.println("덧셈 결과: " + result);

		// 뻴셈 기능 사용하기
		int result2 = calculator.minus(100, 80);
		System.out.println("뺄셈 결과: " + result2);
		
		//나눗셈 기능 사용하기
		double result3 = calculator.devide(10, 3);
		System.out.println("나눗셈 결과: " + result3);
	}

}
