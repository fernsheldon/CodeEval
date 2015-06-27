package CodeEval_FizzBuzz.CodeEval_FizzBuzz;

import java.io.File;
import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] agrs) throws Throwable {

		Scanner scanedFile = new Scanner(new File(agrs[0]));

		while (scanedFile.hasNext()) {

			String full = scanedFile.nextLine();
			String[] splitted = full.split(" ");

			int fizz = Integer.valueOf(splitted[0]);
			int buzz = Integer.valueOf(splitted[1]);
			int count = Integer.valueOf(splitted[2]);

			for (int i = 1; i <= count; i++) {
				final StringBuilder stringBuilder = new StringBuilder();
				if (i % fizz == 0)
					stringBuilder.append("F");
				if (i % buzz == 0)
					stringBuilder.append("B");
				if (stringBuilder.length() == 0)
					stringBuilder.append(String.valueOf(i));
				if (i != count)
					stringBuilder.append(" ");
				System.out.print(stringBuilder);
			}
			System.out.println();
		}
		scanedFile.close();
	}
}
