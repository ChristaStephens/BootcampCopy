import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesDemoApp {

	public static void main(String[] args) throws IOException {
		Scanner scnr = new Scanner(System.in);
		
		// create a directory
		Path dirPath = Paths.get("file-example/one");
		Files.createDirectories(dirPath);
		
		// create an empty file
		Path filePath = Paths.get("file-example/one/myfile.txt");
		if (Files.notExists(filePath) ) {
			Files.createFile(filePath);
		}
		
		filePath = Paths.get(System.getProperty("user.home"), "Desktop/myfile.txt");
		System.out.println(filePath);
		if (Files.notExists(filePath) ) {
			Files.createFile(filePath);
		}
		
		// do some checks
		System.out.println( Files.isDirectory(dirPath) );
		System.out.println( Files.isDirectory(filePath) );
		System.out.println( Files.isWritable(dirPath) );
		System.out.println( Files.isWritable(filePath) );

		scnr.close();
	}
}
