package operator;
// 산술 연산자를 사용해서 총점과 평균 구하기 
public class OperationEx1 {
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore); 	//160
		
		double averageScore = totalScore / 2; // 전체 점수 160 / 과목수2 
		System.out.println(averageScore);
		
	}

}
