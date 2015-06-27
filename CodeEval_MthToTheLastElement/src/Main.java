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
			String[] stringArray = scanedFile.nextLine().split(" ");
			int m = Integer.parseInt(stringArray[stringArray.length-1]);
			
			if(m>stringArray.length-1){
				continue;
			}else{
				System.out.println(stringArray[stringArray.length-m-1]);
			}
		}
		scanedFile.close();
	}
}
