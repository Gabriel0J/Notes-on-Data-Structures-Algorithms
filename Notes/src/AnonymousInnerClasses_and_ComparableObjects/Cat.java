package AnonymousInnerClasses_and_ComparableObjects;

//package Comparable Objects & AIC;
public class Cat implements Comparable<Cat> {
    private String name;
    private int lives;
    public Cat(String name, int lives) {
        this.name = name;
        this.lives = lives;
    }
    public Cat() {
        this.name = "Unknown";
        this.lives = 0;
    }

    public String getName() {
        return name;
    }

    public int getLives() {
        return lives;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLives(int lives) {
        this.lives = lives;
    }

    @Override public String toString() {
        return "Name: " + name + " Lives: " + lives;
    }

    @Override public int compareTo(Cat other) {
        return this.name.compareTo(other.name); // compares cats by names

        //if (this.lives < other.lives) return -1;
        //if (this.lives > other.lives) return 1;
        //return 0; //compares cats by lives
        //numbers aren't important, but whether they're positive or negative is
    }
}
