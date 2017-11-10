/*
 * Reads output from "grep -CN ..." and strips filenames from each block.
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GrepCleaner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> lines = buildList(scanner);
		String block;
		while ((block = getBlock(lines)) != null) {
			System.out.println(block);
		}
	}

	public static String getPathFromString(String s) {
		int pathLen = s.indexOf(".java") + ".java".length();
		return s.substring(0, pathLen);
	}
	
	public static String getBlock(List<String> lines) {
		
		if (lines.isEmpty())
			return null;
		
		String firstLine = lines.remove(0);
		//System.out.println("FIRSTLINE: " + firstLine);
		String path = getPathFromString(firstLine);
		// String result = path.substring(path.length()+1) + "\n"; // java.lang.StringIndexOutOfBoundsException: String index out of range: -1
		String result = path + ":\n" + firstLine.substring(path.length()+1) + "\n";
		while (!lines.isEmpty()) {
			String line = lines.remove(0);
			if (line.equals("--"))
				break;
			else if (!getPathFromString(line).equals(path)) {
				//System.out.format("NON dashdash transition from %s to %s\n", path, line);
				lines.add(0, line);
				break;
			}
			else
				result += line.substring(path.length() + 1) + "\n";
		}
		return result;
	}

	public static List<String> buildList(Scanner scanner) {
		List<String> result = new LinkedList<>();
		while (scanner.hasNextLine())
			result.add(scanner.nextLine());
		return result;
	}

}
