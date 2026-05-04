package Creatures;

public abstract class Creature {
    private String name;
    private int initiative;


    public Creature(String name) {
        this.name = name;
    }

    public int rollInitiative(int ini){
        return this.initiative = ini;
    }

    @Override
    public String toString() {
        return "{" +this.initiative + " " + this.name + "}";

    }
}
