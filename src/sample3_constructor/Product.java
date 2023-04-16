package sample3_constructor;

public class Product {

	int no;
	String name;
	String maker;
	int price;
	
	Product(int no, String name, String maker, int price) {
		this.no = no;			// no변수에 대해서 매개 변수 int no 선언이 존재하기 때문에 no = no라고 적으면 앞에 있는 no에 this자동으로 붙이지 않는다.
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.price = price;
	}
	
	void displayProdutIfo () {
		// 메소드 내부에서 변수를 사용할 때, 변수 이름에 해당되는 매개 변수 선언, 지역 변수 선언이 존재하지 않으면 변수에 자바는 커파일 때 암묵적으로 this를 붙인다. 
		System.out.println("상품정보: " + no);
		System.out.println("상품이름: " + name);
		System.out.println("제조회사: " + maker);
	}
}
