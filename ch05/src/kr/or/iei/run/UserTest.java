package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest {

	public static void main(String[] args) {
		// user1 - 인스턴스(객체)
		User user1 = new User(); // User의 생성자
		
		user1.setId("abc123");
		user1.setPassword("12345");
		user1.setName("nagyunglee");

		System.out.println("아이디: " + user1.getId());
		System.out.println("비밀번호: " + user1.getPassword());
		System.out.println("이름: " + user1.getName());
		
		// System.out.println(user1); //메모리 주소!
		
		
	} //m
}
