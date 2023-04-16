package sample6;

/**
 * 성적정보를(학번, 이름, 국어, 영어, 수학, 총점, 평균, 합격여부, 장학금 수령 여부) 표현하는 클래스다.
 * @author jh_te
 *
 */
public class Score {
	
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	int average;
	boolean passed;
	boolean scholarShip;
	
	public Score(int no, String name, int kor, int eng, int math) {
		// 학번, 이름, 국어, 영어, 수학점수를 멤버 변수에 각각 대입한다.
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		// 총점과 평균을 계산해서 멤버 변수에 대입한다.
		total = kor + eng + math; // 만약 매개변수에 중복되는 변수명이 있다면 this.total 이런식으로 적어야 함
		average = total/3;
		
		// 평균 60점 이상이면 합격여부를 true로 설정한다.
		passed = 60 <= average;
	
		// 평균 95점 이상이면 장학금 수령 여부를 true로 설정한다.
		scholarShip = 95 <= average;
	
	}
}
