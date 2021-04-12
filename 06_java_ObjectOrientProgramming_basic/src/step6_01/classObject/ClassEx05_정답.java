package step6_01.classObject;

// 210412 16:44 ~ 17:07

import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */


class Ex05_01{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}



public class ClassEx05_정답 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		Ex05_01 mega = new Ex05_01();
		mega.name = "메가IT 고등학교";
		
		while (true) {
			
			// 메뉴 출력
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			int count = 0;
			int total = 0;
			int maxScore = 0;
			int minScore = 101;
			int idx = -1;
			
			if		(choice == 1) {
				System.out.println("전교생의 성적");
// 						전교생 수 = 5명
//						총점 = 328점
//						평균 = 65.6점
				for(int i=0; i<mega.arScore.length; i++) {
					total += mega.arScore[i];
					count++;
				}
				System.out.println("전교생의 수 : " + count + "명");
				System.out.println("총점 : " + total + "점");
				System.out.println("평균 : " + (double)total/count + "점");
			}
			
			else if (choice == 2) {
				for(int i=0; i<mega.arScore.length; i++) {
					if(mega.arScore[i] > maxScore) {
						maxScore = mega.arScore[i];
						idx = i;
					}
				}
				System.out.println("1등학생의 학번 : " + mega.arHakbun[idx]);
				System.out.println("1등학생의 점수 : " + maxScore);
			}
			else if (choice == 3) {
				for(int i=0; i<mega.arScore.length; i++) {
					if(mega.arScore[i] < minScore) {
						minScore = mega.arScore[i];
						idx = i;
					}
				}
				System.out.println("꼴등학생의 학번 : " + mega.arHakbun[idx]);
				System.out.println("꼴등학생의 점수 : " + minScore);
			}
			else if (choice == 4) {
				System.out.print("검색할 학번 : ");
				int hakbun = scan.nextInt();
				System.out.println("학번 입력 : " + hakbun);
				
				for(int i=0; i<mega.arHakbun.length; i++) {
					if(hakbun == mega.arHakbun[i]) {
						idx = i;
					}
				}
				if(idx == -1) System.out.println("학번이 검색되지 않음");
				else System.out.println(hakbun + "학번 님의 성적은 " + mega.arScore[idx] + "점입니다.");
				
			}
			else if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		scan.close();


	}

}
