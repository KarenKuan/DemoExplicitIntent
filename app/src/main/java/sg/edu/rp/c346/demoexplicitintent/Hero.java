package sg.edu.rp.c346.demoexplicitintent;

public class Hero {

    private String name;
    private int strength;
    private int techicalProwess;

    public Hero(String name, int strength, int techicalProwess) {
        this.name = name;
        this.strength = strength;
        this.techicalProwess = techicalProwess;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getTechicalProwess() {
        return techicalProwess;
    }
}
