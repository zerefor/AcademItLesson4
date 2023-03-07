import java.security.spec.RSAOtherPrimeInfo;

public class person2 {
    public static void main(String[] args) {
        String name = "Ivan";
        String middleName = "Jovanovich";
        String familyName = "Ivanov";
        int age = 25;
        int day = 16;
        int month = 1;
        int year = 2000;

        Person person = new Person(name, middleName, familyName, age, day, month, year);

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


        System.out.println("original day = " + person.getDay());
        person.setDay(17);
        System.out.println("redacted day = " + person.getDay());
        System.out.println();

        System.out.println("original Month = " + person.getMonth());
        person.setMonth(2);
        System.out.println("redacted Month = " + person.getMonth());
        System.out.println();

        System.out.println("original year = " + person.getYear());
        person.setYear(1980);
        System.out.println("redacted year = " + person.getYear());
        System.out.println();

        System.out.println("original age = " + person.getAge());
        person.setAge(2023 - person.getYear());
        System.out.println("redacted age = " + person.getAge());
        System.out.println();

        System.out.println(person);
    }
}