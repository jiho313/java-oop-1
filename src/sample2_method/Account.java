package sample2_method;

/**
 * 입금, 출금, 비밀변호 변경, 계좌번호 출력 기능을 제공하는 클래스다.
 * @author jh_te
 *
 */
public class Account {

	long balance;
	int password;
	double depositInterestRate;
	long loan; // 대출금
	int interest; // 이자

	// 입금 기능
	// 입금액을 전달 받아서 잔액을 증가시킨다.
	// 반환 타입 : void
	// 메소드명 : deposit
	// 매개 변수 : int amount
	// 구현 내용 : 매개변수로 전달 받은 금액만큼 현재 잔액을 증가시킨다.
	void deposit (int amount) {
		balance += amount;
	}
	
	// 출금 기능
	// 출금액을 전달 받아서 잔액을 감소시키고,출금액만큼의 금액을 반환한다.
	// 반환 타입 : long
	// 메소드명 : withdraw
	// 매개 변수 : int amount, int pwd
	// 구현 내용 : 매개 변수로 전달 받은 출금액만큼 잔액을 감소시키고, 출금액만큼의 금액을 반환한다.
	//			 단, 비밀번호가 일치하지 않으면 오류 메세지를 표시하고, 메소드를 종료한다.
	//			 단, 출금액보다 잔액이 부족하면 오류 메세지를 표히사고, 메소드를 종료한다.
	long withdraw (int amount, int pwd) {
		if (password != pwd) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return 0;
		}
		if (balance < amount)  {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		balance -= amount;
		return amount;
	}
	
	// 비밀번호 변경기능
	// 이전 비밀번호와 신규 비밀번호를 전달 받아서 비밀번호를 변경한다.
	// 반환 타입 : void
	// 메소드명 : changePassword
	// 매개 변수 : int prevPassword, int newPassword
	// 구현 내용 : 매개 변수로 전달 받은 이전 비밀번호와 멤버 변수의 비밀 번호가 일치하면
	// 			 전달 받은 새 비밀번호를 멤버 변수의 password에 대입한다. 
	//			 단, 이전 비밀번호와 새 비밀번호와 동일하면 오류 메세지를 출력하고, 메소드를 종료한다.
	//			 단, 이전 비밀번호와 멤버 변수 password에 저장된 비밀번호가 일치하지 않으면 오류 메세지를 츌력하고, 메소드를 종료한다.
	void changePassword (int prevPassword, int newPassword) {
		if (prevPassword == newPassword) {
			System.out.println("이전 비밀번호와 동일한 비밀번호로 변경할 수 없습니다.");
			return;
		}
		if (prevPassword != password) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}
		password = newPassword; //멤버 변수는 모든 메소드에서 접근 가능
	}
	// 이자 계산
	int getInterest () {
		interest = (int)((double)loan *(depositInterestRate))/12;
		return interest;
	}
	// 계좌번호 출력 기능
	// 비밀번호를 전달 받아서 잔액, 금리를 출력한다
	// 반환 타입 : void
	// 메소드명 : printAccountInfo
	// 매개 변수 : int inputPassword
	// 구현 내용 : 현재잔액, 금리를 화면에 출력한다.
	//			 단, 비밀번호가 일치하지 않으면 오류 메세지를 표시하고, 메소드를 종료한다.
	void printAccountIfo (int inputPassword) {
		if (password != inputPassword) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}
		
		System.out.println("--- 계좌 정보 ---");
		System.out.println("현재 잔액 : " + balance + "원");
		System.out.println("현재 금리 : " + (depositInterestRate*100) + "%");
	}
	
}
