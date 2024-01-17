public class Ex16 {
	public static void main(String[] args) {
		/*
			Write a program that takes arguments from the program args and loops through args and prints each item in args
			Compile using: javac and run using: java 
			i.e. javac Exercise5.java | java Exercise5 foo bar baz
		*/
		for (String arg: args) {
			System.out.println(arg);
		}
	}
}
