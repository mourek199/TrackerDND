package Utilities;

import Conditions.CreatureCondition;
import GameLogic.GameWorld;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * This class is used for loading stuff
 * @author Tony
 */
public class GameData {

    public void loadConditions(GameWorld gameWorld) throws FileNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream input = GameData.class.getResourceAsStream("/dataConditions.json");
        if(input == null){
            throw new FileNotFoundException("bad bad");
        }
        try(input) {
            gameWorld.setConditions(mapper.readValue(input, CreatureCondition[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
