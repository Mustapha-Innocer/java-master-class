package basics.exercises.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {
	public static void main(String[] args) {
		String filePath = "src/basics/exercises/files/data.csv";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			
			StringBuilder stringBuilder = new StringBuilder();
			String line = reader.readLine();
			while (line != null){
				stringBuilder.append(line).append("\n");
				line =  reader.readLine();
			}

			reader.close();

			System.out.println("**********************************");
			System.out.println(stringBuilder.toString());
			reader.close();
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
