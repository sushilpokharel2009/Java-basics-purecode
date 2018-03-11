package employee;

public class main {

	public static void main(String[]args){
		AllEmployees emp1 = new AllEmployees("Gary", 1975, 576200, 206);
		AllEmployees emp2 = new AllEmployees("Tary", 1990, 57200, 100);
		AllEmployees emp3 = new AllEmployees("Hary", 1995, 51200, 1200);
		AllEmployees emp4 = new AllEmployees("Mary", 1992, 36200, 2000);
		AllEmployees emp5 = new AllEmployees("Straberry", 1996, 96200, 2100);
//		System.out.println(emp1);
//		System.out.println();
//		System.out.println(emp2);
//		System.out.println();
//		System.out.println(emp3);
//		System.out.println();
//		System.out.println(emp4);
//		System.out.println();
//		System.out.println(emp5);
//		System.out.println();
		
		System.out.println("Employees Names:");
		emp1.employeeList();
		emp2.employeeList();
		emp3.employeeList();
		emp4.employeeList();
		emp5.employeeList();
		
		System.out.println("All employees details:");
		emp1.details();
		emp2.details();
		emp3.details();
		emp4.details();
		emp5.details();
		
		
		System.out.println("Every individual received the amout of:");
		emp1.totalIncome();
		emp2.totalIncome();
		emp3.totalIncome();
		emp4.totalIncome();
		emp5.totalIncome();
		
	}
}
