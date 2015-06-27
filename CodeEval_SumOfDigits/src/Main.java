import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		
		Scanner scanedFile = new Scanner(new File(args[0]));

		while (scanedFile.hasNext()) {
			long num = Long.parseLong(scanedFile.nextLine().trim());
			long sum = 0;
			while(num>0){
				
				sum+=num%10;
				num/=10;
				
			}
			System.out.println(sum);
		}
		scanedFile.close();
	}
}
