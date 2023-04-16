package sample3_constructor;

public class StudentScore {
	//////////////////////////////////////////////////////////
	// 멤버 변수, 인스턴스 변수, 프로퍼티
	/////////////////////////////////////////////////////////
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double average;
	boolean passed;
	
	//////////////////////////////////////////////////////////
	// 생성자
	//////////////////////////////////////////////////////////
	
	// 매개 변수가 있는 생성자 메소드
	// 번호, 이름, 국어, 영어, 수학 점수를 전달 받아서 해당 멤버 변수를 초기화하고, 계산된 결과로 총점, 평균, 합격여부 초기화한다.
	 StudentScore(int 번호, String 이름, int 국어, int 영어, int 수학) {
		no = 번호;
		name = 이름;
		kor = 국어;
		eng = 영어;
		math = 수학;
		// 총점, 평균, 합격여부를 계산해서 멤버 변수에 대입한다.
		total = 국어 + 영어 + 수학;
		average = total/3.0;
		passed = average >= 60;
	}
	//////////////////////////////////////////////////////////
	// 멤버 메소드
	//////////////////////////////////////////////////////////
	void displayStydentScore() {
		System.out.println("----------------------------------");
		System.out.println("번호: " + no);
		System.out.println("이름: " + name);
		System.out.println("국어 점수: " + kor);
		System.out.println("영어 점수: " + eng);
		System.out.println("수학 점수: " + math);
		System.out.println("총점: " + total);
		System.out.println("평균: " + (int)(average*10)/10.0);
		System.out.println("합격 여부: " + passed);
		System.out.println("----------------------------------");
		System.out.println();
	}
}
