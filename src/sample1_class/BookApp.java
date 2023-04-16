package sample1_class;

public class BookApp {
	
	public static void main(String[] args) {
		// Book클래스로 Book객체 생성하기
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		// 생성된 Book객체 확인하기
		System.out.println(book1); //Book 객체의 해시코드
		System.out.println(book2);
		System.out.println(book3);
		
		// book1 참조 변수가 참조하는 객체의 멤버변수가 조회해서 출력하기
		System.out.println(book1.no);				// 0이 출력된다.
		System.out.println(book1.title);			// null이 출력된다.
		System.out.println(book1.writer);			// null이 출력된다.
		System.out.println(book1.publisher);		// null이 출력된다.
		System.out.println(book1.price); 			// 0이 출력된다.
		System.out.println(book1.onsell);			// false가 출력된다.
		System.out.println(book1.stock);			// 0이 출력된다.
		
		// book2 참조 변수가 참조하는 객체의 멤버변수가 변경하기
		book2.no = 10001;
		book2.title = "자바의 정석";
		book2.writer = "남궁성";
		book2.publisher = "도우출판사";
		book2.price = 35000;
		book2.discountPrice = 32500;
		book2.onsell = true;
		book2.stock = 3;
		
		// book2 참조 변수가 참조하는 객체의 멤버 변수를 조회해서 출력하기
		System.out.println(book2.no);				
		System.out.println(book2.title);			
		System.out.println(book2.writer);			
		System.out.println(book2.publisher);		
		System.out.println(book2.price); 
		System.out.println(book2.discountPrice);
		System.out.println(book2.onsell);			
		System.out.println(book2.stock);
		
		
	}

}
