package basics.exceptions;

public class Main {
	static void name() throws Exception {
		throw new Exception("Checked Exception");
	}
	public static void main(String[] args) {
		try{
			name();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}