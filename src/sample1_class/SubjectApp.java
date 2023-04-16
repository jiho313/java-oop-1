package sample1_class;

public class SubjectApp {

	public static void main(String[] args) {
		
		// Subject subject -> subject 참조 변수는 Subject 클래스로 생성된 객체의 주소값을 저장하는 참조변수다.
		// new Subject() -> new 키워드는 객체를 생성하고, 생성된 객체의 주소값을 참조 변수에 대입한다.
		// 객체 생성 목적 -> 수강 과목 정보를 저장하기 위해서 아래와 같이 객체를 생성한 것이.
		
		Subject subject = new Subject();
		subject.code = "s0325";
		subject.name = "국어학개론";
		subject.department = "국어국문과";
		subject.professor = "김양진";
		subject.major = true;
		subject.credit = 4;
		subject.year = 2017;
		subject.term = "여름학기";
		subject.quota = 35;
		subject.applicants = 5;
		System.out.println("과목코드> " + subject.code);
		System.out.println("과목이름> " + subject.name);
		System.out.println("전공이름> " + subject.department);
		System.out.println("교수이름> " + subject.professor);
		System.out.println("전공필수 여부> " + subject.major);
		System.out.println("학점> " + subject.credit);
		System.out.println("연도> " + subject.year);
		System.out.println("학기> " + subject.term);
		System.out.println("수강정원 > " + subject.quota);
		System.out.println("신청정원> " + subject.applicants);
		
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");

		Subject subject2 = new Subject();
		subject2.code = "s1997";
		subject2.name = "영문학개론";
		subject2.department = "영어영문과";
		subject2.professor = "제임스";
		subject2.major = true;
		subject2.credit = 3;
		subject2.year = 2023;
		subject2.term = "겨울학기";
		subject2.quota = 40;
		subject2.applicants = 20;
		System.out.println("과목코드> " + subject2.code);
		System.out.println("과목이름> " + subject2.name);
		System.out.println("전공이름> " + subject2.department);
		System.out.println("교수이름> " + subject2.professor);
		System.out.println("전공필수 여부> " + subject2.major);
		System.out.println("학점> " + subject2.credit);
		System.out.println("연도> " + subject2.year);
		System.out.println("학기> " + subject2.term);
		System.out.println("수강정원 > " + subject2.quota);
		System.out.println("신청정원> " + subject2.applicants);
		
	}

}
