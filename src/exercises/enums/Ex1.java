package exercises.enums;

public class Ex1 {
	public static void main(String[] args) {
		TshirtSize size = TshirtSize.XL;
		System.out.println(size);

		TshirtSize[] sizes = TshirtSize.values();

		for (TshirtSize tSize : sizes) {
			System.out.println(tSize.name().toLowerCase());
		}
	}
}
