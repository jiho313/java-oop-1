package sample2_method;

/**
 * 사칙연산 기능을 제공하는 클래스다.
 * @author 한지호
 *
 */
public class Calculator {
	
	/**
	 * 정수 2개를 전달받아서 덧셈을 실행하고, 그 결과를 반환한다.
	 * @param num1 첫 번째 정수
	 * @param num2 두 번째 정수
	 * @return 덧셈결과
	 */
	int plus (int num1, int num2) {
		System.out.println("int, int");
		int x = num1 + num2;
		return x;
	}
	
	int plus(int num1, int num2, int num3) {
		System.out.println("int, int, int");
		int x = num1 + num2 + num3;
		return x;
	}
	
	double plus(double num1, double num2) {
		System.out.println("double, double");
		double x = num1 + num2;
		return x;
	}
	
	double plus(double num1, double num2, double num3) {
		System.out.println("double, double, double");
		double x = num1 + num2 + num3;
		return x;
	}
	
	double plus(int num1, double num2) {
		System.out.println("int, double");
		double x = num1 + num2;
		return x;
	}
	
	/**
	 * 정수 2개를 전달받아서 뺄셈을 실행하고, 그 결과를 반환한다.
	 * @param num1 첫 번째 정수
	 * @param num2 두 번째 정수
	 * @return 뺄셈결과
	 */
	int minus (int num1, int num2) {
		int x = num1 - num2;
		return x;
	}
	
	/**
	 * 정수 2개를 전달받아서 곱셈을 실행하고, 그 결과를 반환한다.
	 * @param num1 첫 번째 정수
	 * @param num2 두 번째 정수
	 * @return 곱셈결과
	 */
	int times (int num1, int num2) {
		int x = num1 * num2;
		return x;
	}
	
	/**
	 * 정수 2개를 전달받아서 나눗셈을 실행하고, 그 결과를 반환한다. 결과값은 {@code double} 값이다.
	 * @param num1 첫 번째 정수
	 * @param num2 두 번째 정수
	 * @return 나눗셈결과 {@code double}형의 값
	 */
	double devide ( int num1, int num2) {
		double x = (double)num1 / num2;
		return x;
	}	
	

}
