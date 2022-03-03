public class Name {
    public static void main(String[] args) {

        String firstName = "Milica";
        String lastName = "Lucic";

        System.out.println("Name is " + firstName + " " + lastName);

        makeFullName(firstName, lastName);

        System.out.println(makeFullName(firstName, lastName));
        System.out.println("Method: " + makeFullName(firstName, lastName));
        System.out.println(makeFullName("Ada", "Lovelace"));
    }

    public static String makeFullName (String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
