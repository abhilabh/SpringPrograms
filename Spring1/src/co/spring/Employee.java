package co.spring;

public class Employee {
	int id;
	String name;
	int salary;
	Address address;
	public Employee(Address address) {
		//super();
		this.address = address;
	}
	public Employee() {
		
	}
	public Employee(int id, String name, int salary) {
		//super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void initMethod() {
		System.out.println("----object constructed---->");
	}
	public void destroyMethod() {
		System.out.println("----object destroyed---->");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
}
