package Const.com;

public class ConstB extends ConstA{
	
	public int rollNo;
	private int newYearSalary;
	private int newYearBonus;
	
	public ConstB(String n, int a) {
		super(n, a);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int addIncome(int x, int y){
		int r1 = x + y;
		return r1;
		
	}

	public int getNewYearSalary() {
		return newYearSalary;
	}

	public void setNewYearSalary(int newYearSalary) {
		this.newYearSalary = newYearSalary;
	}

	public int getNewYearBonus() {
		return newYearBonus;
	}

	public void setNewYearBonus(int newYearBonus) {
		this.newYearBonus = newYearBonus;
	}

	
}
