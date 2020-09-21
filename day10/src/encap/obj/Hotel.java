package encap.obj;

public class Hotel {
	private Chef chef;
	private Employee employee;

	public Hotel() {
		this.chef = new Chef();
		this.employee = new Employee();
	}

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
