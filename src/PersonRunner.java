import java.util.Date;

public class PersonRunner {
    public static void main(String[] args) {
        String name = "Ivan";
        String middleName = "Jovanovich";
        String familyName = "Ivanov";
        int age = 25;

        Person person = new Person(name, middleName, familyName, age);

        System.out.println("original name = " + person.getName());
        person.setName("Akakyi");
        System.out.println("redacted name = " + person.getName());
        System.out.println();

        System.out.println("original middleName = " + person.getMiddleName());
        person.setMiddleName("Akakyevich");
        System.out.println("redacted middleName = " + person.getMiddleName());
        System.out.println();

        System.out.println("original familyName = " + person.getFamilyName());
        person.setFamilyName("Buldiga");
        System.out.println("redacted familyName = " + person.getFamilyName());
        System.out.println();

        System.out.println("original age = " + person.getAge());
        person.setAge(29);
        System.out.println("redacted age = " + person.getAge());
        System.out.println();

        Date year = new Date();
        int currentYear = year.getYear() + 1900;

        int birthYear = (currentYear - person.getAge());

        System.out.println(person);
        System.out.println("Born of year: " + birthYear);
    }
}