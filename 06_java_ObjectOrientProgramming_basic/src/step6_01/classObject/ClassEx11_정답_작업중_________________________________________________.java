package step6_01.classObject;
//210413 17:06 ~ 

/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

import java.util.Scanner;


class Ex11_01{
	String name = "";
	
	String[] arAcc = new String[5];
	String[] arPw  = new String[5];
	int[] arMoney  = new int[5];
	
	int accCnt = 0;
	int identifier = -1;
}


public class ClassEx11_정답_작업중_________________________________________________ {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Ex11_01 e = new Ex11_01();
		e.name = "Mega Bank";
		
		for(int i=0; i<e.arAcc.length; i++) {
			e.arAcc[i] = "";
			e.arPw[i] = "";
		}
		
		while (true) {
			
			System.out.print("상태 : ");
			if(e.identifier == -1) System.out.println("로그아웃");
			else System.out.println("로그인됨(" + e.arAcc[e.identifier] + "님)");
			
			System.out.println("[" + e.name + "]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
//				 * 1. 회원가입
//				 * . id와 pw를 입력받아 가입
//				 * . 가입 시 돈 1000원 부여
//				 * . id 중복체크
				
				System.out.print("ID입력 : ");
				String id = scan.next();
				int idCheck = 0;
				for(int i=0; i<e.arAcc.length; i++) {
					if(e.arAcc[i].equals(id)) {
						idCheck = -1;
					}
				}
				if(idCheck == -1) {
					System.out.println("!!!!!!!!!!!사용중인 ID!!!!!!!!!!!");
				}
				else {
					System.out.println("PW입력 : ");
					String pw = scan.next();
					System.out.println("가입금액 입력 : ");
					int money = scan.nextInt();
					
					e.arAcc[e.accCnt] = id;
					e.arPw[e.accCnt] = pw;
					e.arMoney[e.accCnt] = money + 1000;
					e.accCnt++;
					System.out.println("*#*#*#*#*#*#*#*#*#가입 완료*#*#*#*#*#*#*#*#*#");
				}
			}
			else if (sel == 2) {
//				 * 2. 회원탈퇴
//				 * . 로그인시에만 이용가능
				
				if(e.identifier == -1) {
					System.out.println("!!!!!!!!!!!로그인시에만 이용가능!!!!!!!!!!!");
					continue;
				}
				//로그인코드 먼저 구현하고 탈퇴코드 구현
			
			}
			else if (sel == 3) {
//				 * 3. 로그인
//				 * . id와 pw를 입력받아 로그인
//				 * . 로그아웃 상태에서만 이용가능
			}
			else if (sel == 4) {}
			else if (sel == 5) {}
			else if (sel == 6) {}
			else if (sel == 7) {}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}		
		
	}

}
