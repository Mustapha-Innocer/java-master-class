package exercises.rentalyieldcal;

public class Main {
	static double rentalYieldCalc(int monthlyRentalIncome, int propertyPrice) {
		double anualRentalIncome = monthlyRentalIncome * 12;
		return (anualRentalIncome / propertyPrice) * 100;
	}

	public static void main(String[] args) {
		double rentalYield = rentalYieldCalc(1_300, 250_000);
		System.out.printf("%.2f%%\n", rentalYield);
	}
}