package ch07;

public class DoubleTest {

	public static void main(String[] args) {
		
		double dnum = 3.14;
		float fnum = 3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
	}

}

// 부동소수점

// 실수는 정수 보다 정밀하기 때문에 정수와는 다른 방식으로 표현해야 함
// 부동 소수점 방식으로 실수 값 0.1 표현
// 지수부와 가수부로 표현 함
// 컴퓨터에서는 밑수를 2로 사용
// 정규화 : 가수가 밑수보다 작은 한 자리까지 가수로 표현 되는 것
// 컴퓨터에서는 밑수가 2 이므로 정규화를 하게 되면 가수부분의 첫 번째 자리 숫자는 항상 1임 
// 예) 0.2 표현 0.4 X 2-1  정규화 하면 1.6 X 2-3
