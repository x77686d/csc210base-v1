import static org.junit.Assert.*;

import java.util.List;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class GrepCleanerTest {
	
	private static String input1 = "a.java-A\n" +
									"a.java-B\n" +
									"a.java:C\n" +
									"a.java-D\n" +
									"--\n";

	private static String input2 =
			"abcabc.java-A\n" +
			"abcabc.java-B\n" +
			"abcabc.java-C\n" +
			"--\n" +
			"abcabc.java-D\n" +
			"abcabc.java-E\n" +
			"b.java-B1\n" +
			"b.java-B2\n";
	
	static {
		//System.out.println(input2);
	}

	@Test
	public void buildListFromScanner() {
		Scanner scanner = new Scanner(input1);
		List lines = GrepCleaner.buildList(scanner);
		assertThat(lines.size(), is(5));
	}
	
	@Test
	public void getPathFromString()
	{
		String s = "/a/b/c.java-A\nx";
		assertThat(GrepCleaner.getPathFromString(s), is("/a/b/c.java"));
	}
	
	@Test
	public void getBlockAndStop() {
		List<String> lines = GrepCleaner.buildList(new Scanner(input1 + "next\n"));
		String block = GrepCleaner.getBlock(lines);
		assertThat(block, is("a.java:\nA\nB\nC\nD\n"));
		assertThat(lines.get(0), is("next"));
	}
	
	@Test
	public void returnNullBlockAtEnd() {
		List<String> lines = GrepCleaner.buildList(new Scanner(""));
		assertThat(GrepCleaner.getBlock(lines), is(nullValue()));
	}
	
	//@Test
	public void nonDashDashTransition() {
		List<String> lines = GrepCleaner.buildList(new Scanner(input2));
		System.out.println(GrepCleaner.getBlock(lines));
		System.out.println("==========");
		System.out.println(GrepCleaner.getBlock(lines));
		System.out.println("==========");
		System.out.println(GrepCleaner.getBlock(lines));
	}
	





}
