import java.security.spec.RSAOtherPrimeInfo;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
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

    @Override
    public String toString() {
        return middleName + " " + name + " " + familyName + " " + age + " - Year";
    }
}