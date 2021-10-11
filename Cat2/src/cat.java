import java.io.*;

public class cat {
	static void printFile(BufferedReader src) {
		try {
			int ch;

			while ((ch = src.read()) != -1)
				System.out.print((char) ch);
			src.close();
		} catch (IOException e) {
		}
	}

	public static void main(String args[]) {
		if (args.length < 1)
			printFile(new BufferedReader(new InputStreamReader(System.in)));
		else {
			for (int i = 0; i < args.length; i++) {
				try {
					printFile(new BufferedReader(new FileReader(args[i])));
				} catch (FileNotFoundException e) {
					System.err.println(
							"ファイル" + args[i] + "はオープンできません。");
				}
			}
		}
	}
}