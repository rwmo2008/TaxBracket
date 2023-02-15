package src;

public class main {

	public static void main(String[] args) {
		Taxpayer payer1 = new Taxpayer("single", 700000);
		double tax;
		
		tax = payer1.calculateTax(payer1.getType(), payer1.getIncome());
		System.out.println("Tax total due: "+tax);
	}

}
