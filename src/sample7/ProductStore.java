package sample7;

import util.KeyboardReader;
// 키보드로 입력한 정보를 Product객체에 담는 기능을 하는 클래스
public class ProductStore {
	// 멤버 변수이자, 사용할 메소드를 지니고 있는 객체를 생성. 참조 변수를 가지고 있다.
	private KeyboardReader reader = new KeyboardReader(); // 여러 메소드에서 쓰기위해 필드에 선언
	private ProductStoreService service = new ProductStoreService();
	public void menu() {
		// KeyvoardReader의 모든 기능 사용가능
		System.out.println("-------------------------------------------------------------------");
		System.out.println("1.조회 2.등록 3.수정 4.삭제 5.입고 6.출고 0.종료");
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		
		System.out.print("### 메뉴선택 > ");
		int menuNo = reader.readInt(); // KeyboardReader 클래스를 이용해 생성한 reader 객체의 메소드 이용
		System.out.println();;
		
		if (menuNo == 1) {
			조회하기();
		}else if (menuNo == 2) {
			등록하기();
		}else if (menuNo == 3) {
			수정하기();
		}else if (menuNo == 4) {
			삭제하기();
		}else if (menuNo == 5) {
			입고하기();
		}else if (menuNo == 6) {
			출고하기();
		}else if (menuNo == 0) {
			종료하기();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		menu(); // 재귀호출 메소드가 자기 자신을 호출하는 것
	}

	private void 조회하기() {
		System.out.println("<< 상품 정보 조회 >>");
		
		// 모든 상품 정보가 저장되어 있는 배열객체를 조회한다.
		Product[] products = service.getAllProducts();// ProductStoreService 클래스를 이용해 생성한 service 객체의 메소드 이용
		
		// products 참조 변수가 참조하는 배열객체에 저장된 모든 상품 정보 출력하기
		System.out.println("--------------------------------------------------------");
		System.out.println("번호\t상품명\t제조회사\t카테고리\t가격\t재고량\t판매여부");
		System.out.println("--------------------------------------------------------");
		for (Product product : products) {
			if (product == null) {
				break;
			}
			System.out.print(product.getNo() + "\t");
			System.out.print(product.getName() + "\t");
			System.out.print(product.getMaker() + "\t");
			System.out.print(product.getCategory() + "\t");
			System.out.print(product.getPrice() + "\t");
			System.out.print(product.getStock() + "\t");
			System.out.println(product.isOnsell() + "\t");
		}
		System.out.println("-------------------------------------------------------");
	}
	
	private void 등록하기() {
		//키보드 입력으로 신규 상품 정보를 읽어온다.
		// KeyvoardReader의 모든 기능 사용가능
		System.out.println("<< 신규 상품 정보 등록 >>");
		System.out.println("### 신규 상품 정보를 입력하세요.");
		System.out.print("### 상품이름 입력: ");
		String name = reader.readString();
		System.out.print("### 제조회사입력: ");
		String maker = reader.readString();
		System.out.print("### 카테고리 입력: ");
		String category = reader.readString();
		System.out.print("### 상품가격 입력: ");
		int price = reader.readInt();
		System.out.print("### 입고수량 입력: ");
		int stock = reader.readInt();

		// Product객체를 생성해서 신규 상품 정보를 저장한다.
		Product product = new Product();
		product.setName(name);
		product.setMaker(maker);
		product.setCategory(category);
		product.setPrice(price);
		product.setStock(stock);
		product.setOnsell(true);
		
		// ProductStoreService객체의 insetProduct (Product product) 메소드를 실행시켜 신규 상품 정보를 배열에 저장시킨다.
		service.insertProduct(product);
		System.out.println("[완료] 신규 상품 정보가 등록되었습니다.");
	}
	
	private void 수정하기() {
		System.out.println("<< 신규 상품 정보 수정 >>");
		
		System.out.println("### 상품정보 수정에 필요한 정보를 입력하세요");
		System.out.print("### 상품번호 입력: ");
		int no = reader.readInt();
		System.out.print("### 상품이름 입력: ");
		String name = reader.readString();
		System.out.print("### 제조회사 입력: ");
		String maker = reader.readString();
		System.out.print("### 카테고리 입력: ");
		String category = reader.readString();
		System.out.print("### 상품가격 입력: ");
		int price = reader.readInt();
		
		Product product = new Product();
		product.setNo(no);
		product.setName(name);
		product.setMaker(maker);
		product.setCategory(category);
		product.setPrice(price);
		
		service.updateProduct(product);
		System.out.println("### 상품정보 수정이 완료되었습니다.");
		
	}
	
	private void 삭제하기() {
		System.out.println("<< 신규 상품 정보 삭제 >>");
		
		System.out.println("### 삭제할 상품의 번호를 입력하세요.");
		System.out.print("### 상품번호 입력: ");
		int productNo = reader.readInt();
		
		service.deleteProduct(productNo);
		System.out.println("### 상품정보 삭제가 완료되었습니다.");
		
	}
	
	private void 입고하기 () {
		System.out.println("<< 상품 입고 >>");
		
		System.out.println("### 입고할 상품의 번호와 입고수량을 입력하세요.");
		System.out.print("### 상품번호 입력: ");
		int productNo = reader.readInt();
		System.out.print("### 입고수량 입력: ");
		int amount = reader.readInt();
		
		//ProductService객체의 importProduct(int product, int amount) 메소드를 실행시킨다.
		service.importProduct(productNo, amount);
		System.out.println("### 상품입고 처리가 완료되었습니다.");
	}
	
	private void 출고하기 () {
		System.out.println("<< 상품 출고 >>");
		
		System.out.println("### 출고할 상품의 번호와 입고수량을 입력하세요.");
		System.out.print("### 상품번호 입력: ");
		int productNo = reader.readInt();
		System.out.print("### 출고수량 입력: ");
		int amount = reader.readInt();
		
		service.exportProduct(productNo, amount);
		System.out.println("### 상품출고 처리가 완료되었습니다.");
	}
	
	private void 종료하기() {
		System.out.println("<< 프로그램 종료 >>");
		System.exit(0);
		
	}
	
}
