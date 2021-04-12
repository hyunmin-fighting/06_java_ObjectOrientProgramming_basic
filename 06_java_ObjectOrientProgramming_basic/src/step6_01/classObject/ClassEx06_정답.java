package step6_01.classObject;

// 210412 17:10 ~ 17:22

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */
// 210412 17:08 ~ 

class Ex06_01{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}




public class ClassEx06_정답 {

	public static void main(String[] args) {

		Ex06_01 t = new Ex06_01();
		
		Random ran = new Random();
		String[] temp = new String[5];
		
		for(int i=0; i<t.hgd.length; i++) {
			int ranData = ran.nextInt(5)+1;
			t.hgd[i] = ranData;
			
			if(t.answer[i] == ranData) {
				t.answerCnt++;
				t.score += 20;
				temp[i] = "O";
			}
			else {
				temp[i] = "X";
			}
		}
		System.out.println("정답 : " + Arrays.toString(t.answer));
		System.out.println("학생 : " + Arrays.toString(t.hgd));
		System.out.println("정오표 : " + Arrays.toString(temp));
		System.out.println("성적 : " + t.score);
		
	}

}
