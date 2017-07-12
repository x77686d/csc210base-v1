import java.io.IOException;

public class testConsole {
	public static void main(String[] args) throws IOException {
		invisibleMessage();
		
	}
	
	
	
	//pressing enter throughout typing will cause string to be built wrong
	private static void invisibleMessage() throws IOException {
		RawConsoleInput console = new RawConsoleInput();
		
		System.out.println("builds string until loop ends");
		System.out.println("pressing Ctr-c will exit loop\n");
		
		String msg = "";
		char c;
		int input;
		
		while ((input = console.read(true)) != 3) {	//ctr c to kill
			if (input > 0) {
				if (input == 13)
					msg += '\n';
				c = (char)input;
				System.out.println("char: " + c);
				System.out.println("int:  " + input);
				msg += c;
			}
		}
		System.out.println(msg);
	}
}