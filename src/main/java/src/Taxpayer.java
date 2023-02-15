package src;

public class Taxpayer {
	private String type;
	private double income;
	
	public Taxpayer(String type, double income) {
		this.type = type; //single, marriedJoint, marriedSeparate, head
		this.income = income;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
	
	public double calculateTax(String type, double income) {
		double tax = 0.00;
		if (type == "head") {
			tax = calculateTaxHead(income);
		}
		else if (type == "marriedSeparate") {
			tax = calculateTaxMarriedSeparate(income);
		}
		else if (type == "marriedJoint") {
			tax = calculateTaxMarriedJoint(income);
		}
		else { //"single"
			tax = calculateTaxSingle(income);
		}
		return tax;
	}

	/*
	 //2022 rates
	 public double calculateTaxSingle(double income) {
		double incomeRemaining = income;
		double tax = 0.00;
		double bracket = 0.00;
		if (income > 539900) {
			bracket = incomeRemaining - 539900;
			incomeRemaining -= bracket;
			tax += bracket * 0.37;
		}
		if (incomeRemaining > 215950) {
			bracket = incomeRemaining - 215950;
			incomeRemaining -= bracket;
			tax += bracket * 0.35;
		}
		if (incomeRemaining > 170050) {
			bracket = incomeRemaining - 170050;
			incomeRemaining -= bracket;
			tax += bracket * 0.32;
		}
		if (incomeRemaining > 89075) {
			bracket = incomeRemaining - 89075;
			incomeRemaining -= bracket;
			tax += bracket * 0.24;
		}
		if (incomeRemaining > 41775) {
			bracket = incomeRemaining - 41775;
			incomeRemaining -= bracket;
			tax += bracket * 0.22;
		}
		if (incomeRemaining > 10275) {
			bracket = incomeRemaining - 10275;
			incomeRemaining -= bracket;
			tax += bracket * 0.12;
		}
		tax += incomeRemaining * 0.10;
		return tax;
	}

	public double calculateTaxMarriedJoint(double income) {
		double incomeRemaining = income;
		double tax = 0.00;
		double bracket = 0.00;
		if (income > 647850) {
			bracket = incomeRemaining - 647850;
			incomeRemaining -= bracket;
			tax += bracket * 0.37;
		}
		if (incomeRemaining > 431900) {
			bracket = incomeRemaining - 431900;
			incomeRemaining -= bracket;
			tax += bracket * 0.35;
		}
		if (incomeRemaining > 340100) {
			bracket = incomeRemaining - 340100;
			incomeRemaining -= bracket;
			tax += bracket * 0.32;
		}
		if (incomeRemaining > 178150) {
			bracket = incomeRemaining - 178150;
			incomeRemaining -= bracket;
			tax += bracket * 0.24;
		}
		if (incomeRemaining > 83550) {
			bracket = incomeRemaining - 83550;
			incomeRemaining -= bracket;
			tax += bracket * 0.22;
		}
		if (incomeRemaining > 20550) {
			bracket = incomeRemaining - 20550;
			incomeRemaining -= bracket;
			tax += bracket * 0.12;
		}
		tax += incomeRemaining * 0.10;
		return tax;
	}

	public double calculateTaxMarriedSeparate(double income) {
		double incomeRemaining = income;
		double tax = 0.00;
		double bracket = 0.00;
		if (income > 332925) {
			bracket = incomeRemaining - 332925;
			incomeRemaining -= bracket;
			tax += bracket * 0.37;
		}
		if (incomeRemaining > 215950) {
			bracket = incomeRemaining - 215950;
			incomeRemaining -= bracket;
			tax += bracket * 0.35;
		}
		if (incomeRemaining > 170050) {
			bracket = incomeRemaining - 170050;
			incomeRemaining -= bracket;
			tax += bracket * 0.32;
		}
		if (incomeRemaining > 89075) {
			bracket = incomeRemaining - 89075;
			incomeRemaining -= bracket;
			tax += bracket * 0.24;
		}
		if (incomeRemaining > 41775) {
			bracket = incomeRemaining - 41775;
			incomeRemaining -= bracket;
			tax += bracket * 0.22;
		}
		if (incomeRemaining > 10275) {
			bracket = incomeRemaining - 10275;
			incomeRemaining -= bracket;
			tax += bracket * 0.12;
		}
		tax += incomeRemaining * 0.10;
		return tax;
	}

	public double calculateTaxHead(double income) {
		double incomeRemaining = income;
		double tax = 0.00;
		double bracket = 0.00;
		if (income > 539900) {
			bracket = incomeRemaining - 539900;
			incomeRemaining -= bracket;
			tax += bracket * 0.37;
		}
		if (incomeRemaining > 215950) {
			bracket = incomeRemaining - 215950;
			incomeRemaining -= bracket;
			tax += bracket * 0.35;
		}
		if (incomeRemaining > 170050) {
			bracket = incomeRemaining - 170050;
			incomeRemaining -= bracket;
			tax += bracket * 0.32;
		}
		if (incomeRemaining > 89050) {
			bracket = incomeRemaining - 89050;
			incomeRemaining -= bracket;
			tax += bracket * 0.24;
		}
		if (incomeRemaining > 55900) {
			bracket = incomeRemaining - 55900;
			incomeRemaining -= bracket;
			tax += bracket * 0.22;
		}
		if (incomeRemaining > 14651) {
			bracket = incomeRemaining - 14651;
			incomeRemaining -= bracket;
			tax += bracket * 0.12;
		}
		tax += incomeRemaining * 0.10;
		return tax;
	}
	*/
	
	//2021 rates
	public double calculateTaxSingle(double income) {
		double incomeRemaining = income;
		double tax = 0.00;
		double bracket = 0.00;
		if (income > 523600) {
			bracket = incomeRemaining - 523600;
			incomeRemaining -= bracket;
			tax += bracket * 0.37;
		}
		if (incomeRemaining > 209425) {
			bracket = incomeRemaining - 209425;
			incomeRemaining -= bracket;
			tax += bracket * 0.35;
		}
		if (incomeRemaining > 164925) {
			bracket = incomeRemaining - 164925;
			incomeRemaining -= bracket;
			tax += bracket * 0.32;
		}
		if (incomeRemaining > 86375) {
			bracket = incomeRemaining - 86375;
			incomeRemaining -= bracket;
			tax += bracket * 0.24;
		}
		if (incomeRemaining > 40525) {
			bracket = incomeRemaining - 40525;
			incomeRemaining -= bracket;
			tax += bracket * 0.22;
		}
		if (incomeRemaining > 9950) {
			bracket = incomeRemaining - 9950;
			incomeRemaining -= bracket;
			tax += bracket * 0.12;
		}
		tax += incomeRemaining * 0.10;
		return tax;
	}

	public double calculateTaxMarriedJoint(double income) {
		double incomeRemaining = income;
		double tax = 0.00;
		double bracket = 0.00;
		if (income > 628300) {
			bracket = incomeRemaining - 628300;
			incomeRemaining -= bracket;
			tax += bracket * 0.37;
		}
		if (incomeRemaining > 418850) {
			bracket = incomeRemaining - 418850;
			incomeRemaining -= bracket;
			tax += bracket * 0.35;
		}
		if (incomeRemaining > 329850) {
			bracket = incomeRemaining - 329850;
			incomeRemaining -= bracket;
			tax += bracket * 0.32;
		}
		if (incomeRemaining > 172750) {
			bracket = incomeRemaining - 172750;
			incomeRemaining -= bracket;
			tax += bracket * 0.24;
		}
		if (incomeRemaining > 81050) {
			bracket = incomeRemaining - 81050;
			incomeRemaining -= bracket;
			tax += bracket * 0.22;
		}
		if (incomeRemaining > 19901) {
			bracket = incomeRemaining - 19901;
			incomeRemaining -= bracket;
			tax += bracket * 0.12;
		}
		tax += incomeRemaining * 0.10;
		return tax;
	}

	public double calculateTaxMarriedSeparate(double income) {
		double incomeRemaining = income;
		double tax = 0.00;
		double bracket = 0.00;
		if (income > 314150) {
			bracket = incomeRemaining - 314150;
			incomeRemaining -= bracket;
			tax += bracket * 0.37;
		}
		if (incomeRemaining > 209425) {
			bracket = incomeRemaining - 209425;
			incomeRemaining -= bracket;
			tax += bracket * 0.35;
		}
		if (incomeRemaining > 164925) {
			bracket = incomeRemaining - 164925;
			incomeRemaining -= bracket;
			tax += bracket * 0.32;
		}
		if (incomeRemaining > 86376) {
			bracket = incomeRemaining - 86376;
			incomeRemaining -= bracket;
			tax += bracket * 0.24;
		}
		if (incomeRemaining > 40525) {
			bracket = incomeRemaining - 40525;
			incomeRemaining -= bracket;
			tax += bracket * 0.22;
		}
		if (incomeRemaining > 9950) {
			bracket = incomeRemaining - 9950;
			incomeRemaining -= bracket;
			tax += bracket * 0.12;
		}
		tax += incomeRemaining * 0.10;
		return tax;
	}

	public double calculateTaxHead(double income) {
		double incomeRemaining = income;
		double tax = 0.00;
		double bracket = 0.00;
		if (income > 523600) {
			bracket = incomeRemaining - 523600;
			incomeRemaining -= bracket;
			tax += bracket * 0.37;
		}
		if (incomeRemaining > 209400) {
			bracket = incomeRemaining - 209400;
			incomeRemaining -= bracket;
			tax += bracket * 0.35;
		}
		if (incomeRemaining > 164900) {
			bracket = incomeRemaining - 164900;
			incomeRemaining -= bracket;
			tax += bracket * 0.32;
		}
		if (incomeRemaining > 86350) {
			bracket = incomeRemaining - 86350;
			incomeRemaining -= bracket;
			tax += bracket * 0.24;
		}
		if (incomeRemaining > 54200) {
			bracket = incomeRemaining - 54200;
			incomeRemaining -= bracket;
			tax += bracket * 0.22;
		}
		if (incomeRemaining > 14200) {
			bracket = incomeRemaining - 14200;
			incomeRemaining -= bracket;
			tax += bracket * 0.12;
		}
		tax += incomeRemaining * 0.10;
		return tax;
	}
	
}
