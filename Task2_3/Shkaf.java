package Task2_3;

import java.util.HashMap;

public class Shkaf {
    private Chelovek myOwner;

    private int width;
    private int height;
    private int depth;
    private String color;
    private int numberOfPolok;
    private boolean isOpen;
    private HashMap<Integer, Integer> polki = new HashMap<>(); //ключ - номер полки, значение - заполненность полки

    public Shkaf(int width, int height, int depth, String color, int numberOfPolok) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;

        HashMap<Integer, Integer> filler = new HashMap<>();
        for (int i = 0; i < numberOfPolok; i++) {
            filler.put(i, 0);//заполненность каждой полки при создании = 0
        }
        this.polki = filler;
    }

    public void setOwner(Chelovek myOwner) {
        this.myOwner = myOwner;
    }

    public Chelovek getOwner() {
        return myOwner;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean value) {
        if (isOpen == false)
            this.isOpen = true;
    }

    public int getNumberOfPolok() {
        return numberOfPolok;
    }

    public void setNumberOfPolok(int numberOfPolok) {
        this.numberOfPolok = numberOfPolok;
    }

    public void getFilling(){
        for (int shelter: polki.keySet()) {
            System.out.printf("Полка номер %d заполнена на %d процентов%n", shelter+1, polki.get(shelter));
        }
    }

    public void setFilling(int number, int percentage){
        if (number >= 1){
            if (polki.get(number-1) != null) {
                int newVolume = polki.get(number-1);
                polki.put(number-1, newVolume + percentage);
            }
        }
    }

    @Override
    public String toString() {
        return "Shkaf: " +
                "width=" + width +
                "cm, height=" + height +
                "cm, depth=" + depth +
                "cm, color='" + color +
                "Owner=" + myOwner.toString() +
                '}';
    }
}
