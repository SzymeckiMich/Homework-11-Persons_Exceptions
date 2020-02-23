import java.util.InputMismatchException;

public class Test {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();

        try {
            Person person = builder.builder();
        } catch (NameUndefinedException e) {
            System.err.println("Podano złą nazwę");
        } catch (IncorrectAgeException e) {
            System.err.println("Podano zły wiek");
        } catch (InputMismatchException e) {
            System.err.println("Podany wiek nie jest liczbą");
        } finally {
            System.out.println("Koniec");
        }
    }
}

