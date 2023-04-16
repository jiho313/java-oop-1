package sample4_static;

public class CircleApp {

	public static void main(String[] args) {
		
		// 다양한 Circle객체를 생성해서 둘레와 넓이를 계산해보기
		Circle c1 = new Circle(1.0);
		Circle c2 = new Circle(2);
		Circle c3 = new Circle(3);
		Circle c4 = new Circle(5);
		Circle c5 = new Circle(7);
		
		System.out.println("반지름이 1인 원의 둘레: " + c1.round());
		System.out.println("반지름이 1인 원의 넚이: " + c1.area());
		System.out.println("반지름이 2인 원의 둘레: " + c2.round());
		System.out.println("반지름이 2인 원의 넚이: " + c2.area());
		System.out.println("반지름이 3인 원의 둘레: " + c3.round());
		System.out.println("반지름이 3인 원의 넚이: " + c3.area());
		System.out.println("반지름이 4인 원의 둘레: " + c4.round());
		System.out.println("반지름이 4인 원의 넚이: " + c4.area());
		System.out.println("반지름이 5인 원의 둘레: " + c5.round());
		System.out.println("반지름이 5인 원의 넚이 :" + c5.area());
	}

}
