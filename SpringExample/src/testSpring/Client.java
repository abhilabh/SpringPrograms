package testSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("abhi");
		emp.setSalary(500);
		//System.out.println(emp);
		ApplicationContext  context = new ClassPathXmlApplicationContext("test.xml");
		
		Employee e1 = (Employee) context.getBean("emp1");
		Employee e2 = context.getBean("emp2", Employee.class);
		System.out.println(e1);
		System.out.println(e2);
	}
}
