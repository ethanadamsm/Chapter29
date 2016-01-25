import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {	
		String[] lines = readFile("Exercise5.java");
		for(int i = 0; i < lines.length; i++){
			System.out.println(lines[i]);
		}
		System.out.println("");
		Scanner input = new Scanner(System.in);
		String inputs = input.nextLine();
		
		
		if(inputs.length() >= 3 ){
			if(inputs.substring(0, 3).equals("// ")){
				System.out.println(inputs);
			}
		}
	}
	
	public static String[] readFile(String files){
		String line = "";
		int count = 0;
		int number = 0;
		String[] lines = null;
		int sum = 0;
		try{
			File file = new File(files);
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()){
				count += 1;
			}
			lines = new String[count];
			scanner = new Scanner(file);
			for(int i = 0; i < count; i++){
				lines[i] = scanner.nextLine();
			}
		}catch(FileNotFoundException ex) {
            System.out.println("Couldnt find file");  
        }catch(IOException ex) {
             ex.printStackTrace();
        }
		return lines;
	}

}
