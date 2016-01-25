import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		System.out.println("Enter cook time -> ");
		Scanner time = new Scanner(System.in);
		String times = time.nextLine();
		if(times.length() == 1){
			System.out.println("0:0" + times);
		}else if(times.length() == 2){
			System.out.println("0:" + times);
		}else{
			System.out.println(times.substring(0, times.length() - 2) + ":" + times.substring(times.length() - 2, times.length()));
		}
	}

}
