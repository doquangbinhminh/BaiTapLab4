
public class PartTimeEmployee extends Employee {

	public PartTimeEmployee(String name, String gender, int age, String employerName, String dateHired) {
		super(name, gender, age, employerName, dateHired);
		
	}

	int hoursPerWeek;

	

	public PartTimeEmployee(String name, String gender, int age, String employerName, String dateHired,
			int hoursPerWeek) {
		super(name, gender, age, employerName, dateHired);
		this.hoursPerWeek = hoursPerWeek;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hoursPerWeek=" + hoursPerWeek + ", employerName=" + employerName + ", dateHired="
				+ dateHired + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}
