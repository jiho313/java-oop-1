package sample1_class;

import util.KeyboardReader;

public class ScoreApp2_1 {

	public static void main(String[] args) {
		/*
		 * 여러명의 시험성적정보를 키보드로 입력받아서 배열에 저장하고, 그 결과를 출력하기
		 */
		
		// 1. 키보드 입력 읽기 기능을 지원하는 객체 생성하기
		KeyboardReader reader = new KeyboardReader();
		
		// 2. 시험 성적 정보(Score객체) 여러 개를 저장하는 배열 객채 생성하기
		Score[] scores = new Score[3];
		
		// 3.반복문을 사용해서 여러 명의 시험 성적 정보를 입력 받아서 배열에 저장하기
		for (int i = 0; i < scores.length; i++) {
			// 시험 성적 정보를 저장하는 객체를 생성하기
			Score score = new Score();
			// 학번, 이름, 국어, 영어, 수학 점수를 입력 받아서 Score객체의 멤버 변수에 저장하기
			System.out.print("학번 입력: ");
			score.studentNo = reader.readInt();
			
			System.out.print("이름 입력: ");
			score.StudenName = reader.readString();
			
			System.out.print("국어 점수 입력: ");
			score.kor = reader.readInt();
			
			System.out.print("영어 점수 입력: ");
			score.eng =  reader.readInt();
			
			System.out.print("수학 점수 입력: ");
			score.math = reader.readInt();
			
			// 총점, 평균, 통과여부 처리하기
			score.total = score.kor + score.eng + score.math;
			score.average = (double)score.total/3.0;
			score.passed = score.average >= 60;
			
			// score 참조변수에 저장된 주소값을 배열의 i번째 칸에 대입한다.
			scores[i] = score;
			
			System.out.println();
		}
		   	// 4. 반복문을 사용해서 여러명의 시험 성적 정보를 출력하기
		System.out.println("---------------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t합격");
		System.out.println("---------------------------------------------------------");
		for (Score x : scores) { // Score 배열scores를 담을 수 있는 Score x 변수를 만들어 각각의 배열을 저장하고 출력한다
			System.out.print(x.StudenName + "\t");
			System.out.print(x.studentNo+ "\t");
			System.out.print(x.kor + "\t");
			System.out.print(x.eng + "\t");
			System.out.print(x.math + "\t");
			System.out.print(x.total+ "\t");
			System.out.print((int)(x.average*10)/10.0+ "\t"); // 소숫점 앞자리만 보이게 하기
			System.out.println(x.passed+ "\t");
		}
		System.out.println("---------------------------------------------------------");
		

	}

}
