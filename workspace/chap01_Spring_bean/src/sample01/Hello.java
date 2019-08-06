package sample01;

/* 사용 클래스 */
public class Hello {

	public static void main(String[] args) {
		// 클래스 간의 강결합 구조 
		
		// 사용 클래스 -> 구현 클래스(영문, 한글)
		MessageEn msg = new MessageEn();
		msg.sayHello("Tom"); // Hello, Tom!
		MessageKr msg2 = new MessageKr();
		msg2.sayHello("홍길동"); // 안녕하세요, 홍길동씨

	}

}
