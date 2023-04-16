package sample3_constructor;

public class Employee {
	
	String id;					// 필수 입력 값
	String name;				// 필수 입력 값
	String email;
	String tel;			
	String department;			// 필수 입력 값
	int salary;					// 필수 입력 값
	double commissionPct;
	
	// 기본 생성자(Default Constructor) 메소드
	// 기본 생성자 메소드는 매개 변수가 하나도 없는 생성자 메소드다.
	// 기본 생성자 메소드는 컴파일러가 자동으로 추가한다.(단, 생성자가 정의되어 있으면 자동으로 추가하지 않는다.)
	/**
	 * 기본 생성자 메소드다.
	 */
	
	Employee(){
		System.out.println("기본 생성자 메소드가 실행됨.");
	}
	
	/**
	 * 신입 직원 정보용 생성자 메소드다. 신입 직원은 아이디, 이름, 부서, 급여 정보만 전달 받아서 생성된 객체의 멤버 변수에 저장한다.
	 * @param 아이디
	 * @param 이름
	 * @param 부서
	 * @param 급여
	 */
	
	Employee(String id, String name, String department, int salary){
		this(id, name, department, salary, 0.0);
//		this.id = id;
//		this.name = name;
//		this.department = department;
//		this.salary = salary;
	}
	
	/**
	 * 신입 직원 정보용 생성자 메소드다. 신입 직원은 아이디, 이름, 부서, 급여 정보, 커미션 비율만 전달 받아서 생성된 객체의 멤버 변수에 저장한다.
	 * @param 아이디
	 * @param 이름
	 * @param 부서
	 * @param 급여
	 * @param 커미션비율
	 */
	Employee(String id, String name, String department, int salary, double commissionPct){
		this(id, name, null, null, department, salary, commissionPct);
//		this.id = id;
//		this.name = name;
//		this.department = department;
//		this.salary = salary;
//		this.commissionPct = commissionPct;
		
	}
	
	/**
	 * 재직 직원 정보용 생성자 메소드다. 신입 직원은 아이디, 이름, 메일, 전화번호, 부서, 급여 정보, 커미션 비율만 전달 받아서 생성된 객체의 멤버 변수에 저장한다.
	 * @param 아이디
	 * @param 이름
	 * @param 메일
	 * @param 전화번호
	 * @param 부서
	 * @param 급여
	 * @param 커미션비율
	 */
	Employee(String id, String name, String email, String tel, String department, int salary, double commissionPct){
		this.id = id;
		this.name = name;
		this.email = email;
		this.tel = tel;
		this.department = department;
		this.salary = salary;
		this.commissionPct = commissionPct;
	}
	void displayEmplyeeInfo(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(tel);
		System.out.println(department);
		System.out.println(salary);
		System.out.println(commissionPct);
	}
}
