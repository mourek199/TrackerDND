package Utilities;

import Conditions.CreatureCondition;
import GameLogic.GameWorld;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * This class is used for loading stuff
 * @author Tony
 */
public class GameData {

    public void loadConditions(GameWorld gameWorld) {
        ObjectMapper mapper = new ObjectMapper();
        InputStream input = GameData.class.getResourceAsStream("/dataConditions.json");
        if(input == null){
            throw new RuntimeException();
        }
        try(input) {
            //gameMap.setLocations(mapper.readValue(input, Location[].class));
            gameWorld.setConditions(mapper.readValue(input, CreatureCondition[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
