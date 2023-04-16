package sample7;

public class ProductApp {

	public static void main(String[] args) {

		Product p1 = new Product();
		
		// Setter 메소드를 이용해서 객체의 멤버 변수에 값 대입하기
		p1.setNo(100);
		p1.setName("아이패드 미니");
		p1.setMaker("애플");
		p1.setCategory("태블릿");
		p1.setPrice(450000);
		p1.setStock(5);
		p1.setOnsell(true);
		
		// Getter 메소드를 이용해서 객체의 멤버 변수 값 조회하기
		System.out.println(p1.getNo());
		System.out.println(p1.getName());
		System.out.println(p1.getMaker());
		System.out.println(p1.getCategory());
		System.out.println(p1.getPrice());
		System.out.println(p1.getStock());
		System.out.println(p1.isOnsell());
		
		
	}

}
