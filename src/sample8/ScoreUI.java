package sample8;

import util.KeyboardReader;

public class ScoreUI {
	
	ScoreService service = new ScoreService();
	KeyboardReader reader = new KeyboardReader();

	//1.전체조회  2.상세조회  3.등록  4.수정  5.삭제  6.합격자  7.탈락자  0.종료
	public void menu() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("1.전체조회  2.상세조회  3.등록  4.수정  5.삭제  6.합격자  7.탈락자  0.종료");
		System.out.println("--------------------------------------------------------------------");
		System.out.print("### 메뉴 선택>");
		int menuNum = reader.readInt();
		if (menuNum == 1) {
			전체조회();
		} else if (menuNum == 2) {
			상세조회();
		} else if (menuNum == 3) {
			성적등록();
		} else if (menuNum == 4) {
			성적수정();
		} else if (menuNum == 5) {
			성적삭제();
		} else if (menuNum == 6) {
			합격자조회();
		} else if (menuNum == 7) {
			탈락자조회();
		} else if (menuNum == 0) {
			상세조회();
		}
		menu();
}
	
		

	private void 전체조회() {
		System.out.println("### 성적 정보 전체 조회하기");
		Score1[] scores = service.getScoreAll();
		System.out.println("학번\t이름\t평균\t합격여부");
		System.out.println("--------------------------------------------------------------------");
		for (Score1 score : scores) {
			if (score == null) {
				break;
			}
			System.out.print(score.getNo() + "\t");
			System.out.print(score.getName() + "\t");
			System.out.print(score.getAverage() + "\t");
			System.out.println(score.isPassed() + "\t");
			System.out.println("--------------------------------------------------------------------");
		}

	}
	private void 상세조회() {
		System.out.println("### 성적 정보 상세 조회하기");
		System.out.print("조회할 학번 입력> ");
		int no = reader.readInt();
		Score1 score = service.scoreInfo(no);
		System.out.println("학번\t이름\t국어\t영어\t수학\t평균\t합격여부");		
		System.out.println("--------------------------------------------------------------------");
		System.out.print(score.getNo() + "\t");
		System.out.print(score.getName() + "\t");
		System.out.print(score.getKor() + "\t");
		System.out.print(score.getEng() + "\t");
		System.out.print(score.getMath() + "\t");
		System.out.print(score.getAverage() + "\t");
		System.out.println(score.isPassed() + "\t");	
		System.out.println();
	}
	private void 성적등록() {
		System.out.println("### 성적 정보 등록");
		System.out.print("등록할 이름>");
		String name = reader.readString();
		System.out.print("등록할 국어 점수>");
		int kor = reader.readInt();
		System.out.print("등록할 영어 점수>");
		int eng = reader.readInt();
		System.out.print("등록할 수학 점수>");
		int math = reader.readInt();
		Score1 score = new Score1(name, kor, eng, math);
		service.insertScore(score);

	}
	private void 성적수정() {
		System.out.println("### 성적 정보 수정");
		System.out.print("수정할 성적 학번 입력>");
		int no = reader.readInt();
		System.out.print("수정할 국어 점수 입력>");
		int kor = reader.readInt();
		System.out.print("수정할 영어 점수 입력>");
		int eng = reader.readInt();
		System.out.print("수정할 수학 점수 입력>");
		int math = reader.readInt();
		Score1 score = new Score1(no, null, kor, eng, math);
		service.updateScore(score);


	}
	private void 성적삭제() {
		System.out.println("### 성적 정보 삭제");
		System.out.print("삭제할 성적 학번 입력>");
		int no = reader.readInt();
		service.deleteScore(no);

	}
	private void 합격자조회() {
		System.out.println("### 합격자 조회");
		Score1[] scores = service.getScoreAll();
		System.out.println("학번\t이름\t평균\t합격여부");
		System.out.println("--------------------------------------------------------------------");
		for (Score1 score : scores) {
			if (score == null) {
				break;
			}
			if (score.isPassed()) {
			System.out.print(score.getNo() + "\t");
			System.out.print(score.getName() + "\t");
			System.out.print(score.getAverage() + "\t");
			System.out.println(score.isPassed() + "\t");
			System.out.println("--------------------------------------------------------------------");
			}
		}
	
	}
	private void 탈락자조회() {
		System.out.println("### 탈락 조회");
		Score1[] scores = service.getScoreAll();
		System.out.println("학번\t이름\t평균\t합격여부");
		System.out.println("--------------------------------------------------------------------");
		for (Score1 score : scores) {
			if (score == null) {
				break;
			}
			if (!score.isPassed()) {
			System.out.print(score.getNo() + "\t");
			System.out.print(score.getName() + "\t");
			System.out.print(score.getAverage() + "\t");
			System.out.println(score.isPassed() + "\t");
			System.out.println("--------------------------------------------------------------------");
			}
		}
	
	}

	private void 종료() {
		System.exit(0);
	}
	
	

}
