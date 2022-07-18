package ch04;

public class BinarryTest {

	public static void main(String[] args) {
		
		int num = 10;
		int bNum = 0B1010; // 2진수를 의미하는 0B를 사용한다.
		int oNum = 012;    // 8진수를 의미하는 0를 사용한다.
		int xNum = 0XA;    // 16진수를 의미하는 0X를 사용한다.
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}

}


// byte : 1바이트 단위의 자료형 동영상, 음악 파일, 실행 파일의 자료를 처리할 때 사용
// short: 2바이트 단위의 자료형 C/C++ 언어와 호환 시 사용

// int

// 자바에서 사용하는 정수에 대한 기본 자료 형
// 4바이트 단위의 자료형
// 프로그램에서 사용하는 모든 숫자(리터럴)은 int 로 저장됨
// 32 비트를 초과하는 숫자는 long 자료형으로 처리

// long

// 8바이트 자료형
// 숫자의 뒤에 알파벳 L 또는 l 을 써서 long 형임을 표시 함
// int num = 12345678900; // 오류 
// long lnum = 12345678900; //오류 
// long lnumber = 12345678900L; // ok
