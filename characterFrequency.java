import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "java springboot";

        countCharacterFrequency(input);
    }

    public static void countCharacterFrequency(String input) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        char[] characters = input.toCharArray();

        for (char ch : characters) {
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);                
            } else {
                frequencyMap.put(ch, 1);
            }
        }

        System.out.println("Character frequencies in the string: ");
        for (Character key : frequencyMap.keySet()) {
            System.out.println(key + ": " + frequencyMap.get(key));
        }
    }
}