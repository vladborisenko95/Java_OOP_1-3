package Task2_3;

public  abstract class Animal {
    private String model;
    private int age;

    public Animal(String model) {
        this.model = model;
    }
    public Animal(String model, int age) {
        this.model = model;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.model;
    }

}