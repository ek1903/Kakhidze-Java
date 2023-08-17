import java.util.Scanner;
import java.util.ArrayList;

public class task3 {
    public static void main (String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> multiples3 = new ArrayList<Integer>();

        System.out.println("Enter one integer in each line. \nTo end input enter a dot or any symbol other than an integer.");
        Scanner scanner = new Scanner(System.in);
        try {
            while (scanner.hasNextInt()) {
                 numbers.add(scanner.nextInt());
            }
            for (int i = 0; i < numbers.size(); i++) {
                if ((numbers.get(i) % 3) == 0) {
                    multiples3.add(numbers.get(i));
                }
            }    
            System.out.println(multiples3);
        }

        catch (Exception e) {
            System.out.println("Something went wrong.");
        }

    }
}
