package Creatures;

import lombok.Getter;

@Getter
public abstract class Creature {
    private String name;
    private int type;
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
