package ch15;

public class Student {

	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}
}

package ch15;

public class Taxi {

	String taxiName;
	int money;
	
	public Taxi(String taxiName) {
		this.taxiName = taxiName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiName + "택시 수입은 " + money + "입니다.");
	}
}

package ch15;

public class TaxiTest {

	public static void main(String[] args) {

		Student studentE = new Student("Edward", 20000);
		
		Taxi taxi = new Taxi("잘나간다 운수");
		studentE.takeTaxi(taxi);
		
		studentE.showInfo();
		taxi.showTaxiInfo();
	}

}
