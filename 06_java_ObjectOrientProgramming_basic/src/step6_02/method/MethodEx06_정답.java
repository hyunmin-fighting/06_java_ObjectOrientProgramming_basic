package step6_02.method;
//210414 16:28 ~ 16:36

import java.util.Arrays;

class Ex06_01{
	
	void test1(int x, int y) {
		int sum = x + y;
		System.out.println("x부터 y까지의 합 : " + sum);
	}
	
	void test2(int[] arr) {
		int maxNum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > maxNum ) {
				maxNum = arr[i];
			}
		}
		System.out.println("arr배열의 최대값 : " + maxNum);
	}
	
	void test3(int[] arr, int idx1, int idx2) {
		int arg1 = arr[idx1];
		int arg2 = arr[idx2];
		System.out.println("원래의 배열 : " + Arrays.toString(arr));

		arr[idx1] = arg2;
		arr[idx2] = arg1;
		
		System.out.println("변경된 배열 : " + Arrays.toString(arr));
	}
	
}


public class MethodEx06_정답 {

	public static void main(String[] args) {
		
		
			Ex06_01 e = new Ex06_01();
			
			// 문제 1) x부터 y까지의 합을 출력하는 메서드
			int x = 5;
			int y = 10;
			e.test1(x, y);
			
			// 문제 2) arr배열을 전달받아 최대값을 출력하는 메서드
			int[] arr = {87, 100, 35, 12, 46};
			e.test2(arr);
			
			// 문제 3) arr배열과 idx1 , idx2를 전달받아 idx1번째와 idx2번째를 교체한뒤 출력하는 메서드
			int idx1 = 1;
			int idx2 = 4;
			e.test3(arr, idx1, idx2);
		

	}

}
