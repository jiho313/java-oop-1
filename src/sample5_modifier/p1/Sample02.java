package sample5_modifier.p1;

public class Sample02 {

	public static void main(String[] args) {
		Sample01 sample = new Sample01();
		
//		System.out.println(sample.a);   // private접근제한자가 적용된 멤버 변수a는 접근할 수 없다.
		System.out.println(sample.b);	// 같은 패키지이기 때문에 default 접근제한자가 적용된 b에 접근할 수 있다.
		System.out.println(sample.c);	// 같은 패키지이기 때문에 protected 접근제한자가 적용된 c에 접근할 수 있다.
		System.out.println(sample.d);	// 같은 패키지이기 때문에 public 접근제한자가 적용된 d에 접근할 수 있다.

	}

}
