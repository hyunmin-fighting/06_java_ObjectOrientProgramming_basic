package step6_01.classObject;
//210413 16:00 ~ 16:25
import java.util.Scanner;

/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔       돈		1200
 */
//210413 15:41 ~ 


class Ex10_01 {
	String name = "MACDONALD";		// 가게 이름
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}


public class ClassEx10_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Ex10_01 e = new Ex10_01();
		
		while(true) {
			
			System.out.println("====" + e.name + "====");
			for(int i=0; i<e.arMenu.length; i++) {
				System.out.println(i+1 + e.arMenu[i] + "     :     " + e.arPrice[i]);
			}
			System.out.println("1) 주문 / 2) 영수증 출력 ");
			int sel = scan.nextInt();
			
			
			if(sel == 1) {
				System.out.println("===메뉴번호 선택===");
				int menu = scan.nextInt();
				
				menu--;
				e.arCount[menu]++;
			}
			
			else if(sel == 2) {
				System.out.println("금액을 입력: ");
				int money = scan.nextInt();
				
				System.out.println("====" + e.name + "====");
				for(int i=0; i<e.arMenu.length; i++) {
					System.out.println(i+1 + e.arMenu[i] + "     :     "+ "Qty :(" + e.arCount[i]+")"  + e.arPrice[i]);
					e.total += (e.arPrice[i] * e.arCount[i]);
				}
				System.out.println("총금액 : " + e.total);
				
				if(money < e.total) {
					System.out.println("잔액부족");
				}
				else {
					System.out.println("잔돈 : " + (money - e.total));
				}
				break;
			}
			
			
			
		}
		scan.close();

	}

}
