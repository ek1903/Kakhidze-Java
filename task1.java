import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    try {
	        double num = scanner.nextDouble();
	        if (num > 7) {
	            System.out.println("Привет");
	        }
	    }
	    catch (Exception e) {
	        System.out.println("Wrong input.");
	    }
	}
}
