import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		
		Scanner scanedFile = new Scanner(new File(args[0]));

		while (scanedFile.hasNext()) {
			StringBuilder sb = new StringBuilder();
			String[] stringArray = scanedFile.nextLine().split(" ");
			Collections.reverse(Arrays.asList(stringArray));
			for(String str : stringArray){
				sb.append(str +" ");
			}
			System.out.println(sb);
		}
		scanedFile.close();
	}
}
