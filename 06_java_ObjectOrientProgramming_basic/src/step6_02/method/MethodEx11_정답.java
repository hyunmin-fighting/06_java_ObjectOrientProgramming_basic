package step6_02.method;

//210415 16:08 ~ 16:16


class Ex11_01{
	
	int test1(int[] arr) { 
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum; 
	}
	
	
	int test2(int[] arr) { 
		int sumOf4 = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%4 == 0) {
				sumOf4 += arr[i];
			}
		}
		return sumOf4; 
	}
	
	
	int test3(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%4 == 0) {
				count++;
			}
		}
		return count;
	}
	
	
	int test4(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				count++;
			}
		}
		return count;
		
	}

}




public class MethodEx11_정답 {

	public static void main(String[] args) {

		
			Ex11_01 e = new Ex11_01();
			
			int[] arr = {87, 100, 11, 72, 92};
	
			// 문제 1) 전체 합 리턴
			// 정답 1) 362
			int tot = e.test1(arr);    	//int test1(int[] arr){}
			System.out.println("tot = " + tot);
			
			
			
			// 문제 2) 4의 배수의 합 리턴
			// 정답 2) 264
			tot = e.test2(arr); 		// int test2(int[] arr){}
			System.out.println("tot = " + tot);
			
			
			
			// 문제 3) 4의 배수의 개수 리턴
			// 정답 3) 3
			int cnt = e.test3(arr);		// int test3(int[] arr){}
			System.out.println("cnt = " + cnt);
			
			
			
			// 문제 4) 짝수의 개수 리턴
			// 정답 4) 3
			cnt = e.test4(arr);			// int test4(int[] arr){}
			System.out.println("cnt = " + cnt);
	

	}

}
