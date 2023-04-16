package sample2_method;

public class AccountApp {

	public static void main(String[] args) {
		
		// 계좌 정보 관리 기능을 지원하는 Account객체 생성하기
		Account account = new Account();
		
		// 최초 잔액과 비밀번호를 설정하기

		account.balance = 100000;
		account.password = 1234;
		account.depositInterestRate = 0.03;
		account.loan = 5_000_000;
		
		// 입금하기
		account.deposit(500000);
		// 계좌정보 출력하기
		account.printAccountIfo(1234);
		
		// 이자 출력
		int interest = account.getInterest();
		System.out.println("현재 이자: " + interest + "원");
		
		// 출금하기
		long amount = account.withdraw(150000, 1234);
		System.out.println("출금액: " + amount + "원");
		// 비밀번호 변경하기
		account.changePassword(1234, 5678);
		
		// 계좌정보 출력하기
		account.printAccountIfo(5678);
		System.out.println("현재 이자: " + interest + "원");
		
	
		
	}

}
