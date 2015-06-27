import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		
		Scanner scanedFile = new Scanner(new File(args[0]));

		while (scanedFile.hasNext()) {
			StringBuilder sb = new StringBuilder();
			String[] stringArray = scanedFile.nextLine().split(" ");
			ArrayList<Long> maskArray = new ArrayList<Long>();
			for(int i=0; i<stringArray[0].length(); i++){
				
				if(String.valueOf(stringArray[1].charAt(i)).equals("1")){
					sb.append(Character.toUpperCase(stringArray[0].charAt(i)));
				}else{
					sb.append(stringArray[0].charAt(i));
				}
			}
			System.out.println(sb);
		}
		scanedFile.close();
	}
}
