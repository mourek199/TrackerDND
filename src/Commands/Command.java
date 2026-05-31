package Commands;

/**
 * The base element of command design pattern
 */
public interface Command {
      String execute();
      boolean exit();
}
