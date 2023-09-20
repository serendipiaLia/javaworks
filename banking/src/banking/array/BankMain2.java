package banking.array;
// 중복계좌체킹 수업시간
import java.util.Scanner;

public class BankMain2 {
	//계좌를 저장할 배열의 크기 100개로 설정
	static Account[] accounts = new Account[100];
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean sw = true;
		
		while(sw) {
			try {
			System.out.println("=================================================");
			System.out.println("1.계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("=================================================");
			System.out.print("선택> ");
			
			//메뉴 선택
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				createAccount();	//계좌 생성
			}else if(selectNo == 2) {
				getAccountList(); //계좌 목록
			}else if(selectNo == 3) {
				deposit();		 // 입금
			}else if(selectNo == 4) {
				withdraw();		 // 출금
			}else if(selectNo == 5) {
				sw = false;			 //종료
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요.");
			}
			}catch(NumberFormatException e) {
			//	e.printStackTrace();
				System.out.println("올바른 숫자를 입력해 주세요.");
			}
		} // while 끝
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}//main
	
	// 계좌 생성
	private static void createAccount() {
		System.out.println("--------------------------------");
		System.out.println("계좌 생성");
		System.out.println("--------------------------------");
		
		while(true) {
		try {	
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		
		//중복 계좌가 있는지 체킹! 
		if(findAccount(ano) != null) { //중복 계좌 있으면 
			System.out.println("중복계좌 입니다. 다시 입력하세요.");
		}else { // 중복 계좌가 없으면
			System.out.print("계좌주 : ");
			String owner = scanner.nextLine();
			
			System.out.print("초기 입금액 : ");
			int balance = Integer.parseInt(scanner.nextLine());
			//	accounts[0] = new Account(ano, owner, balance);	// 연습데이터 1개 생성
			for(int i=0; i<accounts.length; i++) {
				if(accounts[i] == null) {	//배열의 요소가 비어있을 때 계좌를 저장함
					accounts[i] = new Account(ano, owner, balance);
					System.out.println("결과 : 계좌가 생성되었습니다.");
					break;
				}
			}
			break; //while 빠져나옴
		}
		}catch(NumberFormatException e) {
			//	e.printStackTrace();
			System.out.println("올바른 숫자를 입력해 주세요.");
		}
		} // while 끝
	}
	
	
	// 계좌 목록
	private static void getAccountList() {
		System.out.println("--------------------------------");
		System.out.println("계좌 목록");
		System.out.println("--------------------------------");
		
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {	// 계좌가 있는 배열의 요소 출력
				System.out.print("계좌번호 : " + accounts[i].getAno() + "\t");
				System.out.print("계좌주 : " + accounts[i].getOwner() + "\t");
				System.out.println("잔고 : " + accounts[i].getBalance());
			}
		}
	}

	// 입금
	private static void deposit() {
		System.out.println("--------------------------------");
		System.out.println("입금");
		System.out.println("--------------------------------");
		
	while(true) {	
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		
		//잔고에 더해지는 금액
		if(findAccount(ano) != null) {
			System.out.print("입금액 : ");
			int money = Integer.parseInt(scanner.nextLine());
		
			Account account = findAccount(ano);
			account.setBalance(account.getBalance() + money);
			System.out.println("결과 : 정상 처리 되었습니다.");
			break;
		}else {
			System.out.println("결과 : 계좌가 없습니다. 다시 입력해주세요!");
			}
		} //while 끝
	}
	
	// 출금
	private static void withdraw() {
		System.out.println("--------------------------------");
		System.out.println("출금");
		System.out.println("--------------------------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
	
		System.out.print("출금액 : ");
		int money = Integer.parseInt(scanner.nextLine());
		
			//잔고에 더해지는 금액
		if(findAccount(ano) != null) {
			Account account = findAccount(ano);	
			if(account.getBalance() >= money) {
				account.setBalance(account.getBalance() - money);
				System.out.println("결과 : 정상 처리 되었습니다.");
			}else { System.out.println("잔액이 부족합니다. 다시 입력하세용!");
				}
		}else {
			System.out.println("결과 : 계좌가 없습니다.");
		}
	}
	
	// 계좌 검색 (입금 : findAccount)
	private static Account findAccount(String ano) {
		Account account = null;	//찾을 계좌를 저장할 객체변수 선언
		
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {
				String dbAno = accounts[i].getAno(); //이미 생성된 계좌번호를 가져옴
				if(dbAno.equals(ano)) {	//외부에서 입력한 찾는계좌와 일치하면,
					account = accounts[i];	//일치하는 계좌를 저장함
					break;
				}
			}
		}
		return account;
	}
	
}
