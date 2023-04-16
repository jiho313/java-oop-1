package sample6;

public class ScoreApp {

	public static void main(String[] args) {
		// 성적 정보 관련 조회/변경/삭제 기능을 제공하는 객체 생성하기
		ScoreService service = new ScoreService();
		
		// 합격한 학생수 조회하기
		int passedCount = service.getPassedStudentsCount();
		System.out.println("합격자수> " + passedCount);
		
		// 장학금 수령하는 학생수 조회하기
		int scholarshipCount = service.getReceiveScholarshipStudentsCount();
		System.out.println(scholarshipCount);
		
		// 평균 90점 이상 받은 학생수 조회하기
		int studentCount90 = service.getStudentsCountByAverage(90);
		int studentCount80 = service.getStudentsCountByAverage(80);
		int studentCount70 = service.getStudentsCountByAverage(70);
		System.out.println("평균 90점 이상> " + studentCount90);
		System.out.println("평균 80점 이상> " + studentCount80);
		System.out.println("평균 70점 이상> " + studentCount70);
		
		// 12번학생의 성적정보 조회하기
		Score student1 = service.getScoreByNo(200);
		if (student1 != null) {
			System.out.println("조회된 학생의 이름정보> " + student1.name);
		} else {
			System.out.println("입력된 학번으로 조회할 수 있는 학생정보가 없습니다.");
		}
		
		// 13번학생의 국어점수를 100으로 변경하기
		service.updateScore(10, "국어", 100); // 아직 데이터 베이스가 형성되지 않아서 그전에 변경된 값을 포함해서 구현은 불가
		
		// 모든 학생의 성적 정보를 화면에 출력하기
		//service.printAllScores();

	}

}
