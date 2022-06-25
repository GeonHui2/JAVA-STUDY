package ch21;

public class BreakTest {

	public static void main(String[] args) {

		int sum = 0;
		int num = 1;
		
		for(; sum <= 100; num++) {
			
			sum += num;
			if(sum >= 100)
				break;
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}

// break문 사용하기

// 감싸고 있는 제어문의 블록을 빠져 나오는 기능 (switch문 에서도 사용)
// 반복문에서는 주로 조건문(if)와 같이 사용하여 조건에 해당되는 경우 반복 수행을 멈추고 반복문 외부로 수행이 이동
// 여러 반복문이 중첩되어 있는 경우엔 break 문이 포함되어 있는 반복문만 빠져 나옴


package ch21;

public class CountinueTest {

	public static void main(String[] args) {

		int num;
		for(num = 1; num <= 100; num++) {
			
			if((num % 3) != 0) continue;
			
			System.out.println(num);
		}
	}

}

// continue문 사용하기

// 반복문 내부에서 조건문(if)와 같이 사용하며, 조건이 맞는 경우(true 이면) 이후 반복문 블럭 내부의 다른 수행문들을 수행하지 않음
