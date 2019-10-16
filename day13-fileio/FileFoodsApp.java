import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileFoodsApp {
	
	private static Path filePath = Paths.get("foods.txt");

	public static void main(String[] args) throws IOException {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What food do you want to add?");
		String userFood = scnr.nextLine();
		appendToFile(userFood);
		
		System.out.println( readFile() );
		
		scnr.close();
	}
	
	private static List<String> readFile() {
		// ** Example of reading a file into a list
		try {
			List<String> lines = Files.readAllLines(filePath);
			return lines;
		} catch (FileNotFoundException ex) {
			return new ArrayList<>();
		} catch (IOException ex) {
			ex.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	private static void appendToFile(String item) throws IOException {
		if ( Files.notExists(filePath) ) {
			Files.createFile(filePath);
		}
		
		// ** Example of adding to the end of a file
		// Create a list with the user's food in it
		List<String> linesToAdd = Arrays.asList(item);
		// Write those lines to the end of the file
		Files.write(filePath, linesToAdd, StandardOpenOption.APPEND);
	}
	
	private static void rewriteFile(List<String> items) throws IOException {
		if ( Files.notExists(filePath) ) {
			Files.createFile(filePath);
		}
		
		// ** Example of rewriting a whole file
		List<String> newLines = Arrays.asList("Ramen", "Tacos", "Carrots", "Fish");
		Files.write(filePath, newLines, StandardOpenOption.TRUNCATE_EXISTING);
	}
}
