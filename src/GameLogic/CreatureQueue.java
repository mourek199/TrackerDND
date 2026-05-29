package GameLogic;

import Creatures.Creature;
import lombok.Getter;

import java.util.*;

@Getter
public class CreatureQueue {
    private Queue<Creature> queue = new LinkedList();
    private int turnNumber;

    public Creature addToQueue(Creature creature){
        queue.add(creature);
        reloadQueue(queue);
        return creature;
    }
    public Creature addToQueue(Creature creature, int initiative){
        creature.setInitiative(initiative);
        queue.add(creature);
        return creature;
    }

    public void nextTurn(){
        queue.add(queue.remove());
        turnNumber++;
    }

    public List<Creature> convertToList(Queue<Creature> convertedQueue){
        // Convert to List
        List<Creature> list = new ArrayList<>(convertedQueue);
        return list;
    }
    public List<Creature> sortList(List<Creature> list){
        Collections.sort(list, Comparator.comparing(Creature:: getInitiative).reversed());
        return list;
    }

    public Queue<Creature> listToQueue(List<Creature> list){
        queue.clear();
        queue.addAll(list);
        return queue;
    }

    public Queue<Creature> reloadQueue(Queue<Creature> reloadedQueue){
        return listToQueue(sortList(convertToList(reloadedQueue)));
    }

    public void addToExistingQueue(CreatureQueue creatureQueue, Creature creature){
        creatureQueue.convertToList(creatureQueue.getQueue());
    }

    @Override
    public String toString() {
        return queue + "";
    }
}