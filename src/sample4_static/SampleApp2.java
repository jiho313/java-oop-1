package sample4_static;

public class SampleApp2 {
	
	int x;
	static int y; 
	
	// 클래스 메소드는 멤버 변수에 접근할 수 없다.
	static void m1() {
//		System.out.println(x); //오류
		System.out.println(y);
	}
	// 클래스 메소드는 멤버 메소드를 실행할 수 없다.
	static void m2() {
		m1();
//		m3(); //오류
	}
	// 멤버 메소드는 멤버 변수, 클래스 변수 모두 사용할 수 있다.
	void m3() {
		System.out.println(x);
		System.out.println(y);
	}
	// 멤버 메소드는 멤버 메소드, 클래스 메소드 모두 실행할 수 있다.
	void m4() {
		m1();
		m3();
	}
	
	public static void main(String[] args) {
		// 오류, 클래스 메소드에서 멤버 변수를 사용할 수 없다. 
		// System.out.println(x);
		
		// 멤버 변수를 사용하기 위해서는 객체를 생성하고, 생성된 객체를 참조하는 참조 변수를 이용해야 한다.
		SampleApp2 app = new SampleApp2();
		System.out.println(app.x);
		
		
		System.out.println(y); // 클래스 변수라 클래스 내에서 바로 사용가능
		System.out.println(SampleApp2.y);// 혹은 이렇게
		// 클래스 메소드에서 클래스 변수를 사용할 수 있다.
		// 같은 클래스 안에 있는 클래스 변수는 변수명만으로도 사용가능
		// 클래스 변수y, 클래스 메소드m1() m2()는 사용가능한 상태다
		// 멤버 변수 x, 멤버 메소드 m3() m4()는 사용가능한 상태가 아니다
		// 따라서, 클래스 메소드에서는 멤버변수와 멤버 메소드를 사용할 수 없다.
	}

}
