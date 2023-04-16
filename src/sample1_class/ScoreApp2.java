package sample1_class;

public class ScoreApp2 {

	public static void main(String[] args) {
		Score[] scores = new Score[3]; // 3개의 Score객체를 담을 수 있는 배열 생성
		Score score1 = new Score();
		Score score2 = new Score(); // null 초기화시 실행은 가능하나 참조 변수가 참조할 객체가 없기 때문에 객체를 통해 진입하지 못한다. 결과는 런타임 오류가 난다.
		Score score3 = null; //메소드 안에서 만들어지고 실행되는 지역 변수는 반드시 초기화해야한다.
		
//		System.out.println(score1.studentNo);
//		System.out.println(score1.StudenName);
//		
//		System.out.println(score2.studentNo);
//		System.out.println(score2.StudenName);
		
		score1.studentNo = 2017101440;
		
		scores[0] = score1;
		scores[1] = score2;
		scores[2] = score3; //score3객체는 어차피 참조 값이 없는 null이어서 scores[2]인덱스에 대입해봤자 null결과가 나오게 되고 참조할 객체가 없기 때문에 객체를 통해 진입을 하지 못해 런타임 오류가 난다.
							// 다시 말해 참조가 없는 null값인 score3 객체를 scores 배열에 대입하나마나 null 런타임 에러 발생
		
		for (int i = 0; i < 3; i++) {
			Score score = scores[i]; // 여러 개의 객체를 조회할 때 Score객체를 담은 scores[i]배열을 로컬 변수 Score를 만들어 대입시키면, 반복문이 돌때마다 로컬 변수는 초기화 되어 여러 개의 객체를 조회할 수 있다.
			System.out.println(score); // 각각의 Score객체의 해시코드
			System.out.println(score.studentNo); // 객체를 통한 진입 시도
		}
		
		
		
		

	}

}
