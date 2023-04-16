package sample5_modifier.p1.p11;

import sample5_modifier.p1.Sample01;

public class Sample05 {
	
	public static void main(String[] args) {
		Sample01 sample = new Sample01();
//		System.out.println(sample.a);		// private 접근제한자가 적용된 필드 변수 a에 접근 할 수 없다.
//		System.out.println(sample.b);		// default 접근제한자가 적용된 필드 변수 b에 접근 할 수 없다.
//		System.out.println(sample.c);		// protected 접근제한자가 적용된 필드 변수 c에 접근할 수 없다.
		System.out.println(sample.d);		// public 접근제한자가 적용된 필드 변수 d에만 접근할 수 있다.
	}

}
