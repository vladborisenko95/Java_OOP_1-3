package Task1;

public class Person {

    private String name;
    private String lastName;
    private Sexes sex;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String lastName, Sexes sex) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
    }

    public String getFullName() {
        return name + ' ' + lastName;
    }


    @Override
    public String toString() {
        return "Person{" + name + ' ' + lastName + ' ' + sex + '}';
    }
}