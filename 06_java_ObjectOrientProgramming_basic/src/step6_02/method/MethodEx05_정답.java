package step6_02.method;
//210414 16:12 ~ 16:27

import java.util.Scanner;

class Ex05_01{

	void test1(int num1, int num2, int num3, int num4, int num5) {
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println("입력된 값들의 합 : " + sum);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		
		System.out.print("첫번째 숫자 입력 : ");
		arr[0] = scan.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		arr[1] = scan.nextInt();
		
		System.out.print("세번째 숫자 입력 : ");
		arr[2] = scan.nextInt();
		scan.close();

		int maxNum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		System.out.println("가장 큰 수는 : " + maxNum);
		
	}
	
}


public class MethodEx05_정답 {

	public static void main(String[] args) {

		
			Ex05_01 e = new Ex05_01();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			
			e.test1(1,2,3,4,5);
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			
			e.test2();
		


	}

}
