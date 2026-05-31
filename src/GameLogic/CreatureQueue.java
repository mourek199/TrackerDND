package GameLogic;

import Creatures.Creature;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
/**
 * this class represents a queue (implemented as a linked list) that stores and operates creatures
 */
public class CreatureQueue {

    private Queue<Creature> queue = new LinkedList();
    private int turnNumber;

    /**
     * adds a new creature to queue
     * @param creature new creature
     * @return creature
     */
    public Creature addToQueue(Creature creature){
        queue.add(creature);
        creature.setInitiative(0);
        reloadQueue(queue);
        return creature;
    }
    /**
     * adds a new creature to queue
     * @param creature new creature
     * @param initiative sets the new creature initiative
     * @return creature
     */
    public Creature addToQueue(Creature creature, int initiative){
        creature.setInitiative(initiative);
        queue.add(creature);
        reloadQueue(queue);
        return creature;
    }

    /**
     * moves the queue one step
     */
    public void nextTurn(){
        if (!queue.isEmpty()){
            queue.add(queue.remove());
            turnNumber++;
            System.out.println(turnNumber);
        }
    }

    /**
     * converts queue to list
     * @param convertedQueue queue
     * @return list
     */
    public List<Creature> convertToList(Queue<Creature> convertedQueue){
        // Convert to List
        List<Creature> list = new ArrayList<>(convertedQueue);
        return list;
    }

    /**
     * sorts a list, used when sorting queue
     * @param list
     * @return sorted list
     */
    public List<Creature> sortList(List<Creature> list){
        Collections.sort(list, Comparator.comparing(Creature:: getInitiative).reversed());
        return list;
    }

    /**
     * converts a (sorted) list to queue
     * @param list list
     * @return queue
     */
    public Queue<Creature> listToQueue(List<Creature> list){
        queue.clear();
        queue.addAll(list);
        return queue;
    }

    /**
     *
     * @param reloadedQueue queue
     * @return sorted queue
     */
    public Queue<Creature> reloadQueue(Queue<Creature> reloadedQueue){
        return listToQueue(sortList(convertToList(reloadedQueue)));
    }

    @Override
    public String toString() {
        return queue + "";
    }
}