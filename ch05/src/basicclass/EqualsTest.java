package basicclass;

import java.nio.file.spi.FileSystemProvider;

public class EqualsTest {

	public static void main(String[] args) {
		String name1 = new String("손흥민");
		String name2 = new String("손흥민");
		
		//인스턴스(name1과 name2)의 메모리 주소 비교
		//해쉬코드 : 메모리 주소(10진수)
		System.out.println(System.identityHashCode(name1)); //93122545
		System.out.println(System.identityHashCode(name2));	//2083562754
		
		//메모리주소비교 시, ==동등기호
		System.out.println(name1 == name2); //주소비교 : false
		System.out.println(name1.equals(name2)); //문자열 비교 : true
		
		System.out.println("=================================");
		Book book1 = new Book(100, "개미");
		Book book2 = new Book(100, "개미");
		
		System.out.println(book1 == book2);	//주소비교 : false 
		System.out.println(book1.equals(book2)); //문자열 비교 : false
		
		
	}
}
