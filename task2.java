import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String name = scanner.nextLine();
            if (name.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
            }
            else {
                System.out.println("Нет такого имени");
            }
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
