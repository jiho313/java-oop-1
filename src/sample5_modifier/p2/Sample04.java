package sample5_modifier.p2;

import sample5_modifier.p1.Sample01;

public class Sample04 extends Sample01 {

	public void test() {
//		System.out.println(a);		// private 접근제한자가 적용된 필드 변수 a에 접근 할 수 없다.
//		System.out.println(b);		// default 접근제한자가 적용된 필드 변수 b에 접근 할 수 없다.
		System.out.println(c);		// 상속관계에 있는 경우 다른 패키지여도 protected 접근제한자가 적용된 필드 변수 c에 접근할 수 있다.
		System.out.println(d);		// public 접근제한자가 적용된 필드 변수 d에만 접근할 수 있다.
	}
}
