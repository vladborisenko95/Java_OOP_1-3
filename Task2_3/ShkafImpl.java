package Task2_3;

public interface ShkafImpl {
    void buyShkaf(int width, int height, int depth, String color, int number);
    Shkaf getShkaf();
    void toOpen(Shkaf shkaf);
    void toClose(Shkaf shkaf);
    public void fillShelter(Shkaf shkaf, int number, int percentage);
}