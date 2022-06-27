package ch09;

public class Student {

	int sutdentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	Student(int sutdentId, String studentName){
		this.sutdentId = sutdentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setmathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScoreInfo() {
		
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
}


package ch09;

public class Subject {

	String subjectName;
	int score;
	int subjectId;
}

package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setmathSubject("수학", 99);
		
		Student studentKim = new Student(200, "Kim");
		studentKim.setKoreaSubject("국어", 50);
		studentKim.setmathSubject("수학", 65);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}

}
