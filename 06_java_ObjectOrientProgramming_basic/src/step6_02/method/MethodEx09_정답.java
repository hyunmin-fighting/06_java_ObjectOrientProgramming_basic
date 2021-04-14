
package step6_02.method;

//210414 17:15 ~ 

import java.util.Arrays;

//210414 17:11 ~ 

import java.util.Random;
import java.util.Scanner;


class Ex09_01 {

	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//문제 1)
	void setRandomValuesinArray(int [] scores) {
		
		for(int i=0; i<5; i++) {
			scores[i] = ran.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(scores));
	}
	
	//문제 2)
	void printSumAndAverage (int [] scores) {
		int sum = 0;
		int count = 0;
		int avg = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
			count++;
		}
		avg = sum/count;
		System.out.println("총점("+sum+"), 평균("+avg+")");
	}
	
	//문제 3)
	void printWinner (int [] scores) {
		int count = 0;
		for(int i=0; i<scores.length; i++) {
			if(scores[i] > 60) {
				count++;
			}
		}
		System.out.println("합격자수 : " + count + "명(60점 이상)");
	}
	
	//문제 4)
	void printScore1 (int [] scores) {
		System.out.print("인덱스 입력 : ");
		int idx = scan.nextInt();
		int grade = 0;
		for(int i=0; i<scores.length; i++) {
			if(i == idx) {
				grade = scores[i];
			}
		}
		System.out.println(idx+"인덱스의 성적 : " + grade);

	}
	
	//문제 5)
	void printScore2 (int [] scores) {
		System.out.print("성적 입력 : ");
		int grade = scan.nextInt();
		int idx = -1;
		for(int i=0; i<scores.length; i++) {
			if(scores[i] == grade) {
				idx = i;
			}
		}
		System.out.println(grade+"성적의 인덱스 : " + idx);
	}
	
	//문제 6)
	void printScore3(int [] hakbuns, int [] scores) {
		System.out.print("학번 입력 : ");
		int hakbun = scan.nextInt();
		boolean isFind = false;
		int idx = -1;
			for(int i=0; i<hakbuns.length; i++) {
				if(hakbun == hakbuns[i]) {
					isFind = true;
					idx = i;
					break;
				}
				else {
					System.out.println("학번 검색되지 않음");
				}
			}
			System.out.println("해당학번 학생의 성적 : " + scores[idx]);

	}
	
	//문제 7)
	void printNumberOne (int [] hakbuns, int [] scores) {}
	
}


public class MethodEx09_정답 {

	public static void main(String[] args) {
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex09_01 e = new Ex09_01();
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
		// 예 1) 87, 11, 92, 14, 47
		
		e.setRandomValuesinArray(scores);

		// 문제2) 전교생의 총점과 평균 출력하는 메서드
		// 예 2) 총점(251) 평균(50.2)
		e.printSumAndAverage(scores);
		

		// 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
		// 예 3) 2명
		e.printWinner(scores);
		

		// 문제4) 인덱스를 입력받아 성적 출력하는 메서드
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		e.printScore1(scores);

		// 문제5) 성적을 입력받아 인덱스 출력하는 메서드
		// 정답5) 성적 입력 : 11 인덱스 : 1
		e.printScore2(scores);

		// 문제6) 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점
		e.printScore3(hakbuns, scores);

		// 문제7) 1등학생의 학번과 성적 출력하는 메서드
		// 정답7) 1004번(98점)

	}

}
