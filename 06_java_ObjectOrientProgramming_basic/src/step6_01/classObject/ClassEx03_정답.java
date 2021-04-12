package step6_01.classObject;
// 210412 15:49 ~ 16:00
//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03_01{
	int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_정답 {

	public static void main(String[] args) {
		
		Ex03_01 ex03 = new Ex03_01();
		int sum = 0;
//		int[] arr1 = new int[5];
//		arr1 = ex03.arr;
// 위와 같이 하면 배열 데이터의 메모리가 2곳에 잡히게되어 비효율적
		
		for(int i=0; i<ex03.arr.length; i++) {
			sum += ex03.arr[i];
		}
		System.out.println(sum);
		System.out.println();
		
		sum = 0;
		for(int i=0; i<ex03.arr.length; i++) {
			if(ex03.arr[i] % 4 == 0) {
				sum += ex03.arr[i];
			}
		}
		System.out.println(sum);
		System.out.println();
		
		int count = 0;
		for(int i=0; i<ex03.arr.length; i++) {
			if(ex03.arr[i] % 4 == 0) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println();
		
		count = 0;
		for(int i=0; i<ex03.arr.length; i++) {
			if(ex03.arr[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3



	}

}
