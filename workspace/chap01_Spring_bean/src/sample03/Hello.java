package sample03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import sample03.Message;

public class Hello {
	/*
	 * 인터페이스와 Spring 의존성 주입(DI)에 의한 약결합(최적 환경)
	 * 
	 * 사용클래스 : Hello
	 * 인터페이스 : Message
	 * Spring   : 객체 주입(DI)
	 * 구현클래스 : MessageKr, MessageEn
	 *
	 * 이점 : 클래스에서 객체 생성 코드(new) 사라짐(클래스 간의 독립성 보장)
	 *       빅 팩토리에서 자동으로 객체(Bean) 주입
	 */

	public static void main(String[] args) {
				
		/* 설정파일로 부터 객체 주입 절차 */
		
		// 단계1 : Spring 설정파일 읽어오기 
		Resource resource = new FileSystemResource("src/config/beanFactory.xml");
		
		// 단계2 : 빅 팩토리 객체 생성 : xml 내용으로 빈(object) 생성
		BeanFactory factory = new XmlBeanFactory(resource);
		
		// 단계3 : factory.getBean() : 설정파일에서 Bean(객체) 가져오기
		Message msg = (Message)factory.getBean("message1"); // 한글 인사말 Bean 
		// Message msg = new MessageEn(); 코드와 같은 역할 
		
		msg.sayHello("홍길동");
		
		Message msg2 = (Message)factory.getBean("message2"); // 영문 인사말 Bean
		msg2.sayHello("HONG KIL DONG");

	}

}




















