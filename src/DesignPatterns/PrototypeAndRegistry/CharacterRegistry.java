package DesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;

public class CharacterRegistry {
    private HashMap<String , Character> characterRegistry;

    public CharacterRegistry(){
        characterRegistry = new HashMap<>();
    }

    void register(String key,  Character character){
        // proper validations
        characterRegistry.put(key , character);
    }

    Character get(String key){
        return characterRegistry.get(key).copy();
    }

    void remove(String key){
        characterRegistry.remove(key);
    }
}
