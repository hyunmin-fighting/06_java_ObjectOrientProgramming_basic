package step6_02.method;

// 210414 16:38 ~ 16:49

class Ex07_01 {
	
	void printEvenOrOdd(int x) {
		boolean isOdd = false;
		if(x % 2 != 0) {
			isOdd = true;
		}
		System.out.println("입력된 수는 홀수가" + isOdd + "입니다.");
	}
	void sumBetweenValues(int x, int y) {
		int sum = x + y;
		System.out.println("x부터 y까지의 숫자합은" + sum + "입니다.");
	}

	void printPrimeNums(int primeNumber) {
		for(int i=2; i<=primeNumber; i++) {
			int count = 0;
			for(int n=1; n<=i; n++) {
				if(i%n == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}


public class MethodEx07_정답 {

	public static void main(String[] args) {
		
		
			Ex07_01 e = new Ex07_01();
			
			// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
			int num = 18;
			e.printEvenOrOdd(num);
	
			// 문제 2) x부터 y까지의 합을 출력하는 메서드
			int x = 5;
			int y = 10;
			e.sumBetweenValues(x, y);
	
			// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드 
			int primeNumber = 20;
			e.printPrimeNums(primeNumber);
		



	}

}
