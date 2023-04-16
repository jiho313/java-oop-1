package sample1_class;

import util.KeyboardReader;

public class ScoreApp {

	public static void main(String[] args) {
		
		// 1. 키보드 입력을 읽어오는 기능이 제공되는 객체를 생성한다.
		KeyboardReader reader = new KeyboardReader();
		
		// 2. 시험 성적 정보를 저장하는 객체를 생성하자.
		Score score = new Score();

		// 3. 학번, 이름, 국어, 영어, 수학 점수를 입력 받아서 성적을 계산하고 출력한다.

		System.out.print("학번을 입력하세요>");
		score.studentNo = reader.readInt();
		
		System.out.print("이름을 입력하세요>");
		score.StudenName = reader.readString();
		
		System.out.print("국어 점수를 입력하세요>");
		score.kor = reader.readInt();
		
		System.out.print("영어 점수를 입력하세요>");
		score.eng = reader.readInt();
		
		System.out.print("수학 점수를 입력하세요>");
		score.math = reader.readInt();
		
		score.total = score.kor + score.eng + score.math;
		score.average = score.total/3.0;
		
		if (score.average >= 60) {
			score.passed = true;
			}
		
		System.out.println("-- 시험 성적 정보 --");
		System.out.println("학번 :" + score.studentNo);
		System.out.println("이름 :" + score.StudenName);
		System.out.println("국어 :" + score.kor);
		System.out.println("영어 :" + score.eng);
		System.out.println("수학 :" + score.math);
		System.out.println("총점 :" + score.total);
		System.out.println("평균 :" + ((int)(score.average*10))/10.0); // 소숫점 첫 번째를 출력하기 위해 10을 먼저 곱하고 int로 형변환 후에 다시 실수 10.0으로 나눴다.
		System.out.println("통과여부 :" + score.passed);
		
	}

}
