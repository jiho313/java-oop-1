package sample4_static;

public class SampleApp {

	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.update1(); // 멤버 변수x ++, 클래스 변수 y++ 메소드
		s1.print(); //객체의 x, y값을 출력하는 메소드
		
		Sample s2 = new Sample();
		s2.update1(); // 멤버 변수x ++, 클래스 변수 y++ 메소드
		s2.print(); // 객체의 x, y값을 출력하는 메소드

		Sample s3 = new Sample();
		s3.update1(); // 멤버 변수x ++, 클래스 변수 y++ 메소드
		s3.print(); //객체의 x, y값을 출력하는 메소드
		
		Sample s4 = new Sample();
		s4.update2(); // 클래스 변수y ++ 메소드
		s4.print(); // 객체의 x, y값을 출력하는 메소드
		
		Sample s5 = new Sample();
		s5.update3(); // 멤버 변수x ++ 메소드
		s5.print(); // 객체의 x, y값을 출력하는 메소드
		
		Sample.y = 10; // 클래스 변수의 값을 바꿀 경우 전역적으로 값이 바뀌게 된다.
		s1.print(); // 객체의 x, y값을 출력하는 메소드
		s2.print();
		s3.print();
		s4.print();
		s5.print();
		
	} 

}
