package Task1;

public class Main {
    public static void main(String[] args) {
        Person vasya = new Person("Василий","Пупкин", Sexes.M);//дед
        Person ivan = new Person("Ваня","Пупкин", Sexes.M);//отец
        Person irina = new Person("Ирина","Шольц", Sexes.F);//мать
        //дети
        Person masha = new Person("Маша","Пупкина", Sexes.F);
        Person jane = new Person("Женя", "Пупкина",Sexes.F);

        GeoTree gt = new GeoTree();
        gt.appendChild(vasya, ivan);
        gt.appendChild(irina, masha);
        gt.appendChild(irina, jane);
        gt.appendChild(ivan, masha);
        gt.appendChild(ivan, jane);
        gt.appendPartner(ivan, irina);

        //GeoTree gtForVanya = new Research(gt).getAllRealations();
        gt.getChildren(vasya);//для кого Василий - родитель
        gt.getParents(vasya);//для кого Василий - ребенок
        gt.getPartners(vasya);//для кого Василий - супруг
        gt.getPartners(ivan);//для кого Ваня - супруг
        gt.getParents(jane);//для кого Женя - ребенок
    }

}