import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilePlayersApp {
	
	private static Path filePath = Paths.get("players.txt");

	public static void main(String[] args) throws IOException {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter a player name to add: ");
		String name = scnr.nextLine();
		System.out.print("Enter their jersey number: ");
		int jerseyNum = scnr.nextInt();
		Player newPlayer = new Player(name, jerseyNum);
		appendToFile(newPlayer);
		
		List<Player> players = readFile();
		for (Player p : players) {
			System.out.println(p.getName() + " wears " + p.getJerseyNumber());
		}
		
		scnr.close();
	}
	
	private static List<Player> readFile() {
		// ** Example of reading a file into a list
		try {
			List<String> lines = Files.readAllLines(filePath);
			List<Player> players = new ArrayList<>();
			for (String line : lines) {
				String[] parts = line.split("\t");
				Player p = new Player();
				p.setName(parts[0]);
				p.setJerseyNumber(Integer.parseInt(parts[1]));
				players.add(p);
			}
			return players;

		} catch (NoSuchFileException ex) {
			return new ArrayList<>();
		} catch (IOException ex) {
			ex.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	private static void appendToFile(Player player) throws IOException {
		if ( Files.notExists(filePath) ) {
			Files.createFile(filePath);
		}
		
//		String line = String.format("%s\t%d", player.getName(), player.getJerseyNumber());
		String line = player.getName() + "\t" + player.getJerseyNumber();
		
		// ** Example of adding to the end of a file
		// Create a list with the user's food in it
		List<String> linesToAdd = Arrays.asList(line);
		// Write those lines to the end of the file
		Files.write(filePath, linesToAdd, StandardOpenOption.APPEND);
	}
	
	private static void rewriteFile(List<String> items) throws IOException {
		if ( Files.notExists(filePath) ) {
			Files.createFile(filePath);
		}
		
		// ** Example of rewriting a whole file
		Files.write(filePath, items, StandardOpenOption.TRUNCATE_EXISTING);
	}
}
