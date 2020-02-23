public class Test {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();
        Person person = builder.builder();
        System.out.println(person);
    }
}
