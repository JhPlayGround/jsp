package sample02;

/* 사용 클래스 */
public class Hello {
	
	public static void main(String[] args) {
		// interface 이용 클래스 약결합
		Message msg = new MessageKr();
		msg.sayHello("홍길동"); // Hello, 홍길동!
		// 안녕하세요, 홍길동씨
	}

}
