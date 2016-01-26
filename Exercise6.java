import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		while(true){
			System.out.println("Enter a password");
			Scanner input = new Scanner(System.in);
			System.out.println(hasLower(input.nextLine()));
			if(hasUpper(input.nextLine()) && hasLower(input.nextLine()) & hasInt(input.nextLine())){
				System.out.println("Thank you");
				break;
			}
		}

	}
	
	public static boolean hasUpper(String input){
		return !input.equals(input.toLowerCase());
	}
	
	public static boolean hasLower(String input){
		return !input.equals(input.toUpperCase());
	}
	
	public static boolean hasInt(String input){
		return input.matches(".*\\d.*");
	}

}
