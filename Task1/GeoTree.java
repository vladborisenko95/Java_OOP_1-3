package Task1;

import java.util.ArrayList;
import java.util.HashSet;

public class GeoTree implements GeoTreeImpl, Research{

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {

        return tree;
    }

    @Override
    public void appendChild(Person parent, Person child) {
        if (parent == null || child == null) {
            return;
        }
        tree.add(new Node(parent, Relationship.parent, child));
        tree.add(new Node(child, Relationship.children, parent));

    }

    @Override
    public void appendPartner(Person partner1, Person partner2){
        if (partner1 == null || partner2 == null) {
            return;
        }
        tree.add(new Node(partner1,Relationship.partner,partner2));
        tree.add(new Node(partner2,Relationship.partner,partner1));

    }

    @Override
    public void getParents(Person person) {
        System.out.printf("Родители человека по имени %s : ", person.getFullName());
        ArrayList<String> result = spend(person, Relationship.children);
        if (result.isEmpty()) {
            System.out.println("Данных нет...");
        }
        else {
            System.out.println(result);
        }
    }

    @Override
    public void getChildren(Person person) {
        System.out.printf("Дети человека по имени %s : ", person.getFullName());
        ArrayList<String> result = spend(person, Relationship.parent);
        if (result.isEmpty()) {
            System.out.println("Данных нет...");
        }
        else {
            System.out.println(result);
        }

    }

    @Override
    public void getPartners(Person person) {
        ArrayList<String> result = spend(person, Relationship.partner);
        System.out.printf("Супруг/супруга человека по имени %s : ", person.getFullName());
        if (result.isEmpty()) {
            System.out.println("Данных нет...");
        }
        else {
            System.out.println(result);
        }
    }

    @Override
    public ArrayList<String> spend(Person p, Relationship relation) {
        ArrayList<String> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.getFullName().equals(p.getFullName()) && t.getRelationship() == relation) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }
}