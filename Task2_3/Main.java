package Task2_3;

import Task1.Sexes;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Chelovek chelovek = new Chelovek("Mary", "Poppins", Sexes.F);

    //Задание 2 про Человека и Шкаф
        testingShkaf(chelovek);

    //Задание 3 про Человека и Кошку
        testingCatsInteraction(chelovek);

    //Доп задание на сравнение по HashCode на примере котов
        testingHashCodes();

    //Доп задание на сортировку котов
        testingSort();
    }

    public static void testingShkaf(Chelovek chelovek){
        chelovek.buyShkaf(160, 200, 60, "white", 5);
        chelovek.getShkaf().setOwner(chelovek);
        System.out.println("Человек по имени " + chelovek + " купил шкаф " + chelovek.getShkaf());
        chelovek.toOpen(chelovek.getShkaf());
        System.out.println(chelovek + " открыл шкаф");
        chelovek.fillShelter(chelovek.getShkaf(),1, 10);
        chelovek.fillShelter(chelovek.getShkaf(),3, 30);
        chelovek.fillShelter(chelovek.getShkaf(),5, 50);
        System.out.println(chelovek + " заполнил шкаф таким образом: ");
        chelovek.getShkaf().getFilling();
        chelovek.toClose(chelovek.getShkaf());
        System.out.println(chelovek + " закрыл шкаф ");

    }

    public static void testingCatsInteraction(Chelovek chelovek) {
        chelovek.setCat("Мирошка", Sexes.M, 1);
        Cat cat2 = new Cat("Чужой", Sexes.F, 5);
        chelovek.callAnimal();
        chelovek.callAnimal(cat2);
        while (cat2.getHungriness() > 10)
            chelovek.playWithAnimal(cat2);
        chelovek.playWithAnimal();
        chelovek.playWithAnimal(cat2);
        chelovek.feedAnimal(5);
        cat2.eat(7);
        chelovek.callAnimal(cat2);
        System.out.printf("Уровень голода кота по имени %s = %d \n", cat2.getName(), cat2.getHungriness());
        System.out.printf("Уровень голода кота по имени %s = %d \n",  chelovek.getCat().getName(), chelovek.getCat().getHungriness());

        chelovek.getCat().suckMilk();
        cat2.suckMilk();
        System.out.printf("Уровень голода кота по имени %s = %d \n", cat2.getName(), cat2.getHungriness());
        System.out.printf("Уровень голода кота по имени %s = %d \n",  chelovek.getCat().getName(), chelovek.getCat().getHungriness());

        chelovek.getCat().toilet();
        cat2.toilet(chelovek);
        System.out.printf("Уровень голода кота по имени %s = %d \n", cat2.getName(), cat2.getHungriness());
        System.out.printf("Уровень голода кота по имени %s = %d \n",  chelovek.getCat().getName(), chelovek.getCat().getHungriness());

    }

    private static void testingHashCodes(){
        Cat x = new Cat("Васька", Sexes.M, 1);
        Cat y = new Cat("Васька", Sexes.M, 1);
        System.out.println("x.equals(y) && y.equals(x) = " + (x.equals(y) && y.equals(x)));
        System.out.println("x.hashCode() == y.hashCode() = " + (x.hashCode() == y.hashCode()));
    }

    private static void testingSort(){
        Cat cat1 = new Cat("Тимоха3", Sexes.M, 1);
        Cat cat2 = new Cat("Тимоха1",Sexes.M, 3);
        Cat cat3 = new Cat("Кроха4", Sexes.F, 2);
        Cat cat4 = new Cat("Кроха2", Sexes.F, 4);
        ArrayList<Cat> listOfCats = new ArrayList<>();
        listOfCats.add(cat1);
        listOfCats.add(cat2);
        listOfCats.add(cat3);
        listOfCats.add(cat4);
        System.out.println("Семейство кошачьих: " + listOfCats);
        Collections.sort(listOfCats, new CatNameComparator());
        System.out.println("Упорядочивание по имени: "+ listOfCats);
        Collections.sort(listOfCats, new AnimalAgeComparator());
        System.out.println("Упорядочивание по возрасту: "+ listOfCats);
    }
}