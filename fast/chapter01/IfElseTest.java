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
