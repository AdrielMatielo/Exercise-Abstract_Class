package entities;

public class Individual extends Taxpayer{
	
	private double healthExpenses;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, double healthExpenses) {
		super(name, anualIncome);
		this.healthExpenses = healthExpenses;
	}

	public double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}
	
	private double healthExpensesDiscount() {
		return healthExpenses*0.5;
	}

	@Override
	public double taxToPay() {
		if (getAnualIncome() < 20000.00) {
			return getAnualIncome()*0.15 - healthExpensesDiscount();
		}else {
			return getAnualIncome()*0.20 - healthExpensesDiscount();
		}
	}
	
	
	
	
	
}
