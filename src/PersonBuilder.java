import java.util.Scanner;

public class PersonBuilder {
    public Person builder() throws NameUndefinedException, IncorrectAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastname = scanner.nextLine();
        System.out.println("Podaj pesel: ");
        String pesel = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        return new Person(firstName, lastname, pesel, age);
    }
}
