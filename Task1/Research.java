package Task1;

import java.util.ArrayList;

public interface Research {

    void getParents(Person person);

    void getChildren(Person person);

    void getPartners(Person person);

    ArrayList<String> spend(Person p, Relationship relation);
}