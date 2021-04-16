package step6_02.method;
//210416 15:10 ~ 15:25
import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */

class NumberGame_01{
	
	Scanner scan = new Scanner(System.in);

	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int playerLocation = 4;
	
	void printPlay() {
		for(int i=0; i<move.length; i++) {
			if(move[i] == 0) System.out.print("[ ]");
			else System.out.print("[옷]");
		}
		System.out.println();
	}
	
	
	
	void showMenu() {
		System.out.println("1 : 왼쪽으로 한칸 이동");
		System.out.println("2 : 오른쪽으로 한칸 이동");
		System.out.println("3 : 종료");
	}
	
	
	
	void moveLeft() {
		if(playerLocation > 0) {
			move[playerLocation] = 0;
			move[playerLocation-1] = 8;
			playerLocation = playerLocation-1;
		}
		else System.out.println("더이상 이동할 수 없습니다.");
	}
	
	
	
	void moveRight() {
		if(playerLocation < 9) {
			move[playerLocation] = 0;
			move[playerLocation+1] = 8;
			playerLocation = playerLocation+1;
		}
		else System.out.println("더이상 이동할 수 없습니다.");
	}
	
	
	
	void run() {
		while(true) {
			printPlay();
			showMenu();
			System.out.print("menu를 선택하세요 : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				moveLeft();
			}
			else if(sel == 2) {
				moveRight();
			}
			else if(sel == 3) {
				break;
			}
		}
	}
	
}

public class MethodEx14_테스트문제_Self {

	public static void main(String[] args) {
		
		NumberGame_01 g = new NumberGame_01();

		g.run();

	}

}
