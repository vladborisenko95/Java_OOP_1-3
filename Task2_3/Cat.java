package Task2_3;

import Task1.Sexes;

import java.util.Objects;

public class Cat extends Animal implements MammalsImpl{
    private String name;
    private Sexes sex;
    private int hungriness;


    public Cat(String name) {
        super("Кошачье");
        this.name = name;
    }
    public Cat(String name, Sexes sex, int age) {
        super("Кошачье", age);
        this.name = name;
        this.sex = sex;
        this.hungriness = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String animalClass = super.toString();
        return animalClass + " " + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return super.getAge() == cat.getAge() && hungriness == cat.hungriness && Objects.equals(name, cat.name) && sex == cat.sex;
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result = 31 * result + hungriness;
        result = 31 * result + super.getAge();
        return result;
    }

    @Override
    public String voice() {
        return this.name + " говорит:\"Мяяяяу!!!\"";
    }

    @Override
    public void eat(Integer food) {
        this.hungriness += food;
    }

    @Override
    public void play() {
        if (this.hungriness <= 10) {
            this.hungriness = 0;
            System.out.println(this.name + " играть уже нет сил, надо бы покормить...");
        } else {
            System.out.println(voice());
            this.hungriness -= 10;
        }
    }

    @Override
    public void answer(){
        if (this.hungriness <= 5) {
            this.hungriness = 0;
            System.out.println(this.name + " молчит т.к. нет сил, надо бы покормить...");
        } else {
            System.out.println(voice());
            hungriness -= 5;
        }
    }

    @Override
    public int getHungriness() {
        return this.hungriness;
    }

    @Override
    public void toilet() {
        System.out.println(this.name + " гадит (_._)");
        this.hungriness = hungriness <= 10 ? 0 : hungriness - 10;
    }

    public void toilet(Chelovek chelovek) {
        System.out.println(this.name + " гадит в тапки U U человека по имени " + chelovek.getName());
        this.hungriness = hungriness <= 10 ? 0 : hungriness - 10;
    }

    @Override
    public void suckMilk() {
        if (super.getAge() <= 1) {
            System.out.println(this.name + " сосет молоко");
            this.hungriness += 25;
        } else {
            System.out.println(this.name + " лакает молоко");
            this.hungriness += 5;
        }
    }
}