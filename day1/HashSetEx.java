package day1;


import java.util.HashSet;
import java.util.Objects;

class Employee {
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class HashSetEx {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "aaa");
		Employee emp2 = new Employee(2, "bbb");
		Employee emp3 = new Employee(4, "ccc");
		
		HashSet<Employee> hset = new HashSet<>();
		hset.add(emp1);
		hset.add(emp2);
		hset.add(emp3);
		
		hset.forEach((e) -> {System.out.println(e);});

	}
}