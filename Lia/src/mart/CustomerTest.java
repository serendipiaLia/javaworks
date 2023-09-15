package mart;
	//일반고객: 이름 '이순신' , 아이디 '10010' 누적된 포인트'1000점'
	//vip고객: 이름 '김유신' , 아이디 '10020' 누적된 포인트 '10000점'
public class CustomerTest {
	public static void main(String[] args) {
		//일반고객 불러오기
		Customer customerLee = new Customer();
		customerLee.name = "이순신";
		customerLee.id = "10010";
		customerLee.address = "서울시 마포구";
		customerLee.point = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		//결과값 : 이순신님의 등급은 basic이며, 아이디는 10010 입니다. 
		//		 가입 시 입력한 고객의 주소는 서울시 마포구이며 이 고객의 적립된 포인트는 1000점 입니다.
	
		//VIP고객 불러오기
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.name = "김유신";
		customerKim.id = "10020";
		customerKim.address = "경기도 부천";
		customerKim.point = 10000;
		
		System.out.println(customerKim.showVIPCustomerInfo());
		// 결과값 : 김유신님의 등급은 VIP이며, 아이디는 10020입니다.
		// 가입 시 입력하신 고객 주소는 경기도 부천이며, 누적된 포인트는 10000점 입니다. 
		//담당 전문 상담원은 null입니다.
	
	
	
	
	
	}
	
	
}
