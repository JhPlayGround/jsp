package example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import sample03.Message;

public class PrintUse
{
	/* 사용 클래스 : PrintUse
	 * 인터페이스 : Print
	 * 구현 클래스 : ConsolePrint, PrintPrint
	 */
	public static void main(String[] args)
	{
		Print p = new ConsolePrint();
		p.printer();
		
		Print p2 = new PrinterPrint();
		p2.printer();
		
		
		Resource resource = new FileSystemResource("src/config/beanFactory.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Print p3 = (Print)factory.getBean("print1"); //
		p3.printer();
		
		Print p4 = (Print)factory.getBean("print2"); //
		p4.printer();
	}
}
