package sample7;
// 객체의 값을 저장하는 클래스
public class Product {

	private int no;
	private String name;
	private String maker;
	private String category;
	private int price;
	private int stock;
	private boolean onsell;
	
	// 생성자
	public Product( ) {
		
	}
	
	public Product(int no, String name, String maker, String category, int price) {
		this.no = no;
		this.name = name;
		this.maker = maker;
		this.category = category;
		this.price = price;
		this.stock = 10;
		this.onsell = true;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isOnsell() {
		return onsell;
	}

	public void setOnsell(boolean onsell) {
		this.onsell = onsell;
	}


	
}
