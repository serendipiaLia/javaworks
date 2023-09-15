package reference.subjects2;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student(101, "김대희"); //new Student 10개이상입력시 오류 
												//-> array 크기 10이기때문
		Student park = new Student(102, "유재석");
		
		//과목 추가
		kim.addSubject("국어", 90);
		kim.addSubject("수학", 85);
		kim.addSubject("과학", 78);
		kim.showStudentInfo();	//과목 출력

		System.out.println("==================================");
		
		park.addSubject("코딩", 95);
		park.addSubject("java", 88);
		park.addSubject("python", 90);
		park.showStudentInfo();	//과목 출력
		
	}
}
