package step6_01.classObject;

import java.util.Scanner;

//210413 15:12 ~ 15:40
/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */


class Ex09_01{
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
	
}


public class ClassEx09_정답 {

	public static void main(String[] args) {		
		
		Ex09_01 e = new Ex09_01();
		Scanner scan = new Scanner(System.in);
		int check = 0;
		
//		for(int i=0; i<e.back.length; i++) {
//			e.back[i] = 0;
//		}
		
		while(true) {
			
			for(int i=0; i<e.front.length; i++) {
				if(i == e.front.length - 1) {
					System.out.print(e.front[i]);
				}
				else {
					System.out.print(e.front[i] + ", ");
				}
			}
			System.out.println();
			
			for(int i=0; i<e.back.length; i++) {
				if(i == e.front.length - 1) {
					System.out.print(e.back[i]);
				}
				else {
					System.out.print(e.back[i] + ", ");
				}
			}
			System.out.println();
			
			check = 0;
			for(int i=0; i<e.back.length; i++) {
				if(e.back[i] == 0) {
					check++;
				}
			}
			if(check == 0) {
				break;
			}
			
			
			System.out.print("1번 인덱스 입력 : ");
			int idx1 = scan.nextInt();
			System.out.print("2번 인덱스 입력 : ");
			int idx2 = scan.nextInt();
			
			if(e.front[idx1] == e.front[idx2]) {
				e.back[idx1] = e.front[idx1];
				e.back[idx2] = e.front[idx2];
			}
			
			
			
			
			
		}
		scan.close();
	}

}
