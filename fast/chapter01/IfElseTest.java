package ch14;

public class IfElseTest {

	public static void main(String[] args) {

		int age = 7;
		
		if (age >= 8) {
			System.out.println("학교에 다닙니다.");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		System.out.println("노는게 젤 좋아");
	}

}

// if문 문법

// if(조건식){
//   수행문;      // 조건식이 '참'인 경우에(조건에 맞는 경우) 수행문이 수행됨 
//  }             // 조건식이 '참'이 아니면(조건에 맞지 않는 경우) 수행문이 수행되지 않음

// if - else 문 문법

// if( 조건식) {
//     수행문1;   // 조건식이 '참'인 경우에 수행됨
// }
// else{
//     수행문2;    // 조건식이 '참'이 아닌 경우에 수행됨
// }


package ch15;

public class IfElseIfTest {

	public static void main(String[] args) {

		int age = 12;
		int charge;
		
		if (age < 8){
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}
		else if (age < 14){
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		else if (age < 20){
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는" + charge + "입니다.");
	}

}


// if-else if 문과 if - if 문의 차이점


// if- else if 를 사용하는 경우 하나의 조건이 만족 되면 나머지 else if 부분은 수행되지 않음
// if - if 로 사용하게 되면 각각 다른 조건 문으로 해석되어 각각 수행하게 됨
// ( 위 예제를 if 로 모두 바꾸어 봅시다.)
