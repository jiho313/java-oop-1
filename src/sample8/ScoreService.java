package sample8;

import java.util.concurrent.atomic.AtomicInteger;

import sample6.Score;

public class ScoreService {
	
	Score1[] repo = new Score1 [6];
	int position = 0;
	AtomicInteger atomic = new AtomicInteger(10);
	ScoreService () {
		repo[position++] = new Score1(atomic.getAndIncrement(), "홍길동", 10, 80, 40);
		repo[position++] = new Score1(atomic.getAndIncrement(), "김유신", 60, 55, 70);
		repo[position++] = new Score1(atomic.getAndIncrement(), "강감찬", 20, 35, 20);
		repo[position++] = new Score1(atomic.getAndIncrement(), "이순신", 90, 100, 80);
		repo[position++] = new Score1(atomic.getAndIncrement(), "유관순", 65, 95, 75);
	}
	

	// 전체 조회
	public Score1[] getScoreAll() {
		return repo;
	}
	
	// 상세 조회
	public Score1 scoreInfo (int no) {
		Score1 score = new Score1();
		for (Score1 scores : repo) {
			if (scores == null) {
				break;
			}
			if (scores.getNo() == no) {
				score = scores;
			}
		}
		return score;
	}

	// 등록
	public void insertScore (Score1 score) {
		int no = atomic.getAndIncrement();
		score.setNo(no);
		repo[position] = score;
		position++;
	}
	
	// 수정
	public void updateScore (Score1 score) {
		for (Score1 scores : repo) {
			if (score == null) {
				break;
			}
			if (scores.getNo() == score.getNo()) {
				scores.setKor(score.getKor());
				scores.setEng(score.getEng());
				scores.setMath(score.getMath());
				scores.setTotal(score.getKor() + score.getEng() + score.getMath());
				scores.setAverage(scores.getTotal()/3);
				break;
			}
		}
	}

	
	// 삭제
	public void deleteScore (int no) {
		int findIndex = -1;
		for (int index = 0; index < position; index++) {
			if (repo[index].getNo() == no) {
				findIndex = index;
			}
		}
		if (findIndex != -1) {
			for (int i = findIndex + 1; i < position; i++) {
				repo[i - 1] = repo[i];
			}
			repo[position - 1] = null;
			position--;
		}
	}


}
