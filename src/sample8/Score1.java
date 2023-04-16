package sample8;

public class Score1 {

	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private int average;
	private boolean passed;
	
	public Score1() {}

	public Score1(String name, int kor, int eng, int math) { // 등록 생성자
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.average = this.total/3;
		this.passed = this.average >= 60;
	}
	
	
	public Score1(int no, String name, int kor, int eng, int math) { // ScoreService 기본 생성자 즉시 생성자
		this(name, kor, eng, math);
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}
	
}
