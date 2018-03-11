package employee;

public class AllEmployees {
	String name;
	int dateOfBirth;
	double yearlySalary;
	double yearlyBonus;

	public String getName() {
		return name;
	}


	public void setName(String nam) {
		this.name = nam;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	public double getYearlyBonus() {
		return yearlyBonus;
	}

	public void setYearlyBonus(double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	public AllEmployees(){
		
	}
	
	public AllEmployees(String nm, int dob, double ys,
			double yb) {
		
		this.name = nm;
		this.dateOfBirth = dob;
		this.yearlySalary = ys;
		this.yearlyBonus = yb;
	}
	
	
	public void employeeList(){
		System.out.println(name);
	}


	public void employeeList1() {
		// TODO Auto-generated method stub
		
	}
	
	public double totalIncome(){
		System.out.println(yearlySalary + yearlyBonus);
		return yearlyBonus;
	}


	public void totalIncome1() {
		// TODO Auto-generated method stub
		
	}


	public void details1() {
		// TODO Auto-generated method stub
		
	}
	
	public String details(){
		System.out.println("Name of the Employee: " +name + "\nDate of Birth: " + dateOfBirth + "\nYearly Salary: " + yearlySalary + "\nYearly Bonus :" + yearlyBonus);
		return("Name of the Employee: " +name + "\nDate of Birth: " + dateOfBirth + "\nYearly Salary: " + yearlySalary + "\nYearly Bonus :" + yearlyBonus);
		
	}
	
	
	
}
