package sample4_static;

public class Sample {
	int x;
	static int y;
	
	void update1() {
		x++;
		Sample.y++;
	}
	void update2() {
		Sample.y++;
	}
	void update3() {
		x++;
	}
	
	void print() {
		System.out.println("멤버 변수 x의 값-> " + x);
		System.out.println("클래스 변수 y의 값-> " + Sample.y);
	}
	
}
