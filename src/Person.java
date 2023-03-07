import java.security.spec.RSAOtherPrimeInfo;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;
    private int year;
    private int day;
    private int month;

    public Person(String name, String middleName, String familyName, int age, int day, int month, int year) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
        this.year = year;
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
        }
        System.out.println("Name changed");
    }

    public void setMiddleName(String middleName) {
        if (!(middleName.length() == 0)) {
            this.middleName = middleName;
        }
        System.out.println("MiddleName changed");
    }

    public void setFamilyName(String familyName) {
        if (!(familyName.length() == 0)) {
            this.familyName = familyName;
        }
        System.out.println("FamilyName changed");
    }

    public void setAge(int age) {
        if ((age >= 15)) {
            this.age = age;
        }
        System.out.println("age changed");
    }

    public void setDay(int day) {
        if (!(day < 1)) {
            this.day = day;
        }
        System.out.println("day changed");
    }

    public void setMonth(int month) {
        if (!(month < 1)) {
            this.month = month;
        }
        System.out.println("month changed");
    }

    public void setYear(int year) {
        if ((year >= 1960)) {
            this.year = year;
        }
        System.out.println("year changed");
    }

    @Override
    public String toString() {
        return middleName + " " + name + " " + familyName + " " + age + "\n" + day + "." + month + "." + year;
    }
}