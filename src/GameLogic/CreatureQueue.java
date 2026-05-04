package GameLogic;

import Creatures.Creature;

import java.util.LinkedList;
import java.util.Queue;

public class CreatureQueue {
    private Queue<Creature> queue = new LinkedList();

    public Creature addToQueue(Creature creature){
        queue.add(creature);
        return creature;
    }

    public void nextTurn(){
        queue.add(queue.remove());
    }

    @Override
    public String toString() {
        return queue + "";
    }
}