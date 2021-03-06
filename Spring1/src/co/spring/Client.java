package co.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Client {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("abhi");
		emp.setSalary(500);
		//System.out.println(emp);
		ApplicationContext  context = new ClassPathXmlApplicationContext("employeeBean.xml");
		
		Employee e1 = (Employee) context.getBean("emp1");
		//Employee e2 = context.getBean("emp2", Employee.class);
		System.out.println(e1);
		//System.out.println(e2);
		//object destroyed called
//		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
//		cxt.close();
		
		//another way
//		Resource resource = new ClassPathResource("employeeBean.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		Employee e4 = (Employee) context.getBean("emp1");
//		Employee e5 = context.getBean("emp2", Employee.class);
//		System.out.println("another way===================");
//		System.out.println(e4);
//		System.out.println(e5);
		
	}
}
