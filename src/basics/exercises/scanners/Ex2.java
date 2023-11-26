package basics.exercises.scanners;

public class Ex2 {
	public static void main(String[] args) {
		for (String str: args) {
			try {
				int num = Integer.parseInt(str);
				if (num%2==0) {
					System.out.println(num + " is an even number");
				} else {
					System.out.println(num + " is not an even number");
				}

			} catch (Exception e){
				System.out.println(str + " not a number");
			}
		}
	}
}
