package DesignPatterns.PrototypeAndRegistry;

public class Client {
    public static void someMethod(Character character){
        // we want to generate a copy
//        Character character1 = new Character(character);
        Character newCharacter =  character.copy();
//        if(character instanceof HumanCharacter){
//            character1 = new HumanCharacter((HumanCharacter) character);
//        } else if(character instanceof PlantCharacter){
//            character1 = new PlantCharacter((PlantCharacter) character);
//        }
        // And so on
    }

    public static void main(String[] args) {

        Character character = new Character("1", "XYZ",100 , "SomeImage");
        HumanCharacter humanCharacter = new HumanCharacter("2", "Hume", 50, "some");


        CharacterRegistry characterRegistry = new CharacterRegistry();

        characterRegistry.register("Normal" , character);
        characterRegistry.register("Human" , humanCharacter);

        HumanCharacter humanCharacter1 = (HumanCharacter) characterRegistry.get("Human");
        someMethod(character);
        someMethod(humanCharacter);
    }
}
