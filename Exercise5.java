import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {	
		String[] lines = readFile("source.java");
		boolean cont = false;
		for(int i = 0; i < lines.length; i++){
			String current = lines[i].trim();
			if(current.length() >= 2){
				if(cont == true){
					System.out.println(lines[i]);
				}
				if(current.substring(0, 2).equals("//")){
					System.out.println(lines[i]);
				}else if(current.substring(0, 2).equals("/*")){
					System.out.println(lines[i]);
					cont = true;
				}else if(current.substring(0, 2).equals("*/")){
					cont = false;
				}
			}
		}
	}
	
	public static String[] readFile(String files){
		String input = "";
		try{
			BufferedReader file = new BufferedReader(new FileReader(files));
			String line;
			while((line = file.readLine()) != null){
				input += line + '\n';
			}
			
		}catch(FileNotFoundException ex) {
            System.out.println("Couldnt find file");  
        }catch(IOException ex) {
             ex.printStackTrace();
        }
		String[] output = input.split("\\r?\\n");
		return output;
	}

}
