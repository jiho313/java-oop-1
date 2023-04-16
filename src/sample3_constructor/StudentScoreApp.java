package sample3_constructor;

public class StudentScoreApp {

	public static void main(String[] args) {
		
		StudentScore s1 = new StudentScore(100, "홍길동", 80, 80, 60);
		StudentScore s2 = new StudentScore(110, "김유신", 50, 70, 60);
		StudentScore s3 = new StudentScore(111, "강감찬", 40, 40, 60);
		StudentScore s4 = new StudentScore(132, "류관순", 80, 8090, 60);
		StudentScore s5 = new StudentScore(133, "이순신", 100, 100, 60);
		
		s1.displayStydentScore();
		s2.displayStydentScore();
		s3.displayStydentScore();
		s4.displayStydentScore();
		s5.displayStydentScore();

	}

}
