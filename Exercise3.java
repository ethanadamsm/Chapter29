import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		String[] male = {"Elroy", "Fred", "Graham"};
		String[] female = {"Amy", "Buffy", "Cathy"};
		while(true){
			String name;
			System.out.println("Enter a name:");
			Scanner names = new Scanner(System.in);
			name = names.nextLine();
			if(name.isEmpty()){
				break;
			}else{
				String[] namesplit = name.split("\\s+");
				if(isInArray(male, namesplit[0])){
					System.out.println("Mr. " + name);
				}else if(isInArray(female, namesplit[0])){
					System.out.println("Ms. " + name);
				}
			}
		}

	}
	
	public static boolean isInArray(String[] array, String name){
		for(int i = 0; i < array.length; i++){
			if(name.equals(array[i])){
				return true;
			}
		}
		return false;
	}

}
