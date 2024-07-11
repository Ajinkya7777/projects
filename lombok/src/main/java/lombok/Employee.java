package lombok;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private int empId;
	private String empName;
	
	
	public static void main(String[] args) {
		Employee emp = new Employee(1,"AAA");
		
		System.out.println(emp.empId);
		System.out.println(emp.empName);
	}
}
