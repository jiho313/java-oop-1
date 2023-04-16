package sample3_constructor;

public class EmployeeApp {

	public static void main(String[] args) {
		

		// 신입 사원 정보, 경력 사원 정보, 재직중인 사원 정보를 표현하는 객체를 생성하기
		
		// 신입 사원 정보는 아이디, 이름, 소속부서, 급여정보를 가지고 있다.
		// Employee 클래스로 객체를 생성하고, 생성자 메소드 중에서 Employee(String, String, String, in) 매개 변수를가지고 있는 생성자 메소드를 실행한다.
		Employee emp1 = new Employee("hong", "홍길동", "인사과", 3000000);
//		emp1.id = "hong";
//		emp1.name = "홍길동";
//		emp1.department = "인사과";
//		emp1.salary = 3_000_000;
		emp1.displayEmplyeeInfo();
		
		// 경력 사원 정보는 아이디, 이름, 소속부서, 급여정보, 커미션지급 비율 정보를 가지고 있다.
		Employee emp2 = new Employee("kim", "김유신", "개발2팀", 8000000, 0.1);
//		emp2.id = "kim";
//		emp2.name = "김유신";
//		emp2.department = "개발2팀";
//		emp2.salary = 8_000_000;
//		emp2.commissionPct = 0.1;
		emp2.displayEmplyeeInfo();
		
		// 재직중인 사원정보는 아이디, 이름, 이메일, 전화번호, 소속부서, 급여정보, 커미션지급 비율 정보를 가지고 있다.
		Employee emp3 = new Employee("lee", "이순신", "lee@gmail.com", "02-1234-5678", "기획팀", 4_500_000, 0.07);
		emp3.displayEmplyeeInfo();
		
		
		
	}

}
