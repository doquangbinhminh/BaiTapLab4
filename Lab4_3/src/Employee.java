
public class Employee extends Person {
	 public Employee(String name, String gender, int age) {
		super(name, gender, age);
		
	}

	String employerName,dateHired;

	public Employee(String name, String gender, int age, String employerName, String dateHired) {
		super(name, gender, age);
		this.employerName = employerName;
		this.dateHired = dateHired;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Employee [employerName=" + employerName + ", dateHired=" + dateHired + ", name=" + name + ", gender="
				+ gender + ", age=" + age + "]";
	}
	 
}
