package Task1;

public class Node {

    public Node(Person p1, Relationship relationship, Person p2) {
        this.p1 = p1;
        this.relationship = relationship;
        this.p2 = p2;
    }

    Person p1;
    Relationship relationship;
    Person p2;

    public Relationship getRelationship() {
        return relationship;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, relationship, p2);
    }

}