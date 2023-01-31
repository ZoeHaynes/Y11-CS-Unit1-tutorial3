import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        String userInfo = ("First Name: " + firstName + "\nLast Name: "+ lastName + "\nAge: " + age);
        System.out.println(userInfo);

    }
}