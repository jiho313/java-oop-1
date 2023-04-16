package sample6;

public class ScoreService {
	
	// 성적 정보를 10개 저장하는 배열 객체를 생성하고, 멤버 변수 scores에 배열 객체의 주소값을 대입한다.
	private Score[] scores = new Score[10];
	
	public ScoreService() {
		scores[0] = new Score(10, "김유신", 80, 80, 80);
		scores[1] = new Score(11, "강감찬", 100, 100, 100);
		scores[2] = new Score(12, "이순신", 80, 80, 50);
		scores[3] = new Score(13, "류관순", 70, 70, 60);
		scores[4] = new Score(14, "안창호", 100, 90, 95);
		scores[5] = new Score(15, "윤봉길", 40, 40, 50);
		scores[6] = new Score(16, "안중근", 60, 60, 70);
		scores[7] = new Score(17, "김구", 40, 50, 30);
		scores[8] = new Score(18, "권율", 85, 85, 60);
		scores[9] = new Score(19, "이이", 95, 100, 80);
	}
	
	// 시험에 합격한 학생수를 반환하는 메소드
	// 반환타입 : int //반환할 타입의 변수를 만들어 리턴에 입력해 놓는 것이 편하다.
	// 메소드명 : getPassedStudentsCount
	// 매개변수 : 없다.
	public int getPassedStudentsCount() {
		int count = 0;
		
		for (Score score : scores) {
			//System.out.println(score.name + " " + score.passed); // 학생의 이름과 합격여부 출력
			if (score.passed) {
			count++;
			}
		}
		return count;
	}
	
	// 장학금을 수령하는 학생수를 반환하는 메소드
	// 반환타입 : int
	// 메소드명: getReceiveScholarshipStudentsCount
	// 매개변수 : 없다.
	public int getReceiveScholarshipStudentsCount() {
		int count = 0;
		
		for (Score score : scores) {
			if (score.scholarShip) {
				count++;
			}
		}
		return count;
	}
	
	// 평균 점수를 전달 받아서 해당 평균 점수 이상을 획득한 학생수를 반환하는 메소드
	// 반환타입 : int
	// 메소드명 : getStudentsCountByAverage
	// 매개변수 : int average 
	public int getStudentsCountByAverage (int average) {
		int count = 0;
		for (Score score : scores) {
			if (score.average >= average) {
				count++;
			}
		}
		return count;
	}
	
	// 학번을 전달받아서 성적정보를 반환하는(조회하는) 메소드
	// 반환타입 : Score
	// 메소드명 : getScoreByNo
	// 매개변수 : int studentNo
	// 이 메소드를 실행하면 "Score 타입 객체의 주소값" 혹은 "null" 값을 획득하게 된다.
	public Score getScoreByNo (int studentNo) {
		Score foundScore = null;
		for (Score score : scores) {
			if (score.no == studentNo) {			
				foundScore = score;
				break;// 학번이 일치하는 성적정보를 발견했기 때문에 반복문을 탈출한다. 
			}
		}
		return foundScore;
	}
	
	// 학번, 과목명, 점수를 전달받아서 성적 정보를 수정하는 메소드
	// 반환타입 : void
	// 메소드명 : updateScore
    // 매개변수 : int studentNo, String subject, int value
	public void updateScore (int studentNo, String subject, int value) {
		Score score = getScoreByNo(studentNo);
		if (score == null) {
			System.out.println("학번과 일치하는 성적 정보가 없습니다.");
		}
		
		int prevValue = 0;
		if ("국어".equals(subject)){
			prevValue = score.kor;
			score.kor = value;
		} else if ("영어".equals(subject)){
			prevValue = score.eng;
			score.eng = value;
		} else if ("수학".equals(subject)){
			prevValue = score.math;
			score.math = value;
		}else {
			System.out.println("해당하는 점수 정보가 없습니다.");
			return;
		}
			
		// 총점, 평균, 합격여부, 장학금수령여부 업데이트 하기.
		score.total = score.kor + score.eng + score.math;
		score.average = score.total/3;
		score.passed = score.average >= 60;
		score.scholarShip = score.average >= 95;
		System.out.println(subject + "점수가 [" + prevValue + "]에서 [" + value + "]로 변경되었습니다.");
	}
	// 모든 성적정보를 화면에 출력하는 메소드
	// 반환타입 : void
	// 메소드명 : printAllScores
	// 매개변수 : 없다
	public void printAllScores () {
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t합격\t장학금");
		for (Score score : scores) {
			System.out.print(score.no + "\t");
			System.out.print(score.name + "\t");
			System.out.print(score.kor + "\t");
			System.out.print(score.eng + "\t");
			System.out.print(score.math + "\t");
			System.out.print(score.total + "\t");
			System.out.print(score.average + "\t");
			System.out.print(score.passed + "\t");
			System.out.println(score.scholarShip);
		}
	}
	
	
	
	
	
	
	

}
