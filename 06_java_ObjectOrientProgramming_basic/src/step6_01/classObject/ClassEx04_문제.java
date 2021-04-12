package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//210412 16:12 ~ 16:42

class Ex04_01 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}



public class ClassEx04_문제 {

	public static void main(String[] args) {
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		Ex04_01 t = new Ex04_01();
		Random ran = new Random();
		
		for(int i=0; i<t.scores.length; i++) {
			int num = ran.nextInt(100)+1;
			t.scores[i] = num;
		}
		System.out.println(Arrays.toString(t.scores));
		System.out.println();
		
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
		int total = 0;
		int count = 0;
		
		for(int i=0; i<t.scores.length; i++) {
			total += t.hakbuns[i];
			count++;
		}
		System.out.println("총점(" + total + ")");
		System.out.println("평균(" + total/count + ")");
		
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		
		count = 0;
		for(int i=0; i<t.scores.length; i++) {
			if(t.hakbuns[i] >= 60) {
				count++;
			}
		}
		System.out.println("합격자수 : " + count + "명");
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 인덱스 입력 : ");
		int idx = scan.nextInt();
		System.out.println("인덱스 입력 : " + idx);
		int grade = t.scores[idx];
		System.out.println("성적 : " + grade);
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		idx = 0;
		
		System.out.println("검색할 성적 입력 : ");
		int grade1 = scan.nextInt();
		System.out.println("성적 입력 : " + grade1);
		for(int i=0; i<t.scores.length; i++) {
			if(t.scores[i] == grade1) {
				idx = i;
			}
		}
		System.out.println("인덱스 : " + idx);
		
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		
		System.out.println("검색할 학번 입력 : ");
		int hakbun = scan.nextInt();
		System.out.println("학번 입력 : " + hakbun);
		for(int i=0; i<t.hakbuns.length; i++) {
			if(hakbun == t.hakbuns[i]) {
				idx = i;
			}
		}
		System.out.println("성적 : " + t.scores[idx] + "점");
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		idx = -1;
		System.out.println("검색할 학번 입력 : ");
		int hakbun1 = scan.nextInt();
		System.out.println("학번 입력 : " + hakbun1);
		for(int i=0; i<t.hakbuns.length; i++) {
			if(hakbun1 == t.hakbuns[i]) {
				idx = i;
			}
		}
		if(idx == -1) System.out.println("학번 검색 안됨");
		else System.out.println("성적 : " + t.scores[idx] + "점");
		
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		
		int maxScore = 0;
		for(int i=0; i<t.scores.length; i++) {
			if(t.scores[i] > maxScore) {
				maxScore = t.scores[i];
				idx = i;
			}
		}
		System.out.println(t.hakbuns[idx] + "(" + maxScore + ")");
		
		scan.close();
	}

}
