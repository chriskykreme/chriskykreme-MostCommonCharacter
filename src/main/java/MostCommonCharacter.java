import java.util.*;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        // Create a HashMap and add all of str's characters to it.
        HashMap<Character, Integer> characterCount = new HashMap<Character, Integer>();
        Set<Character> keys = new HashSet<Character>();

        // Add letters of string to HashMap
        // Populate Set with keys of HashMap
        // Ensure no character is added more than once
        for (int i = 0; i < str.length(); i++) {
            
            // If chracter is already in keys, it's already in the HashMap. 
            // Increment its count and continue through the string
            Character currentChar = str.charAt(i);
            if (keys.contains(currentChar)) {
                characterCount.put(currentChar, characterCount.get(currentChar) + 1);
                continue;
            }

            // If here the character is not present in HashMap, add it.
            characterCount.put(currentChar, 0);

            // Add the character to keys in case it occurs again
            keys.add(currentChar);
        }

        // Determine which character occurs most
        int largest = characterCount.get(str.charAt(0));
        String largestKey = ""; 
        for (char key : keys) {
            if (characterCount.get(key) >= largest) {
                largest = characterCount.get(key);
                largestKey = "";
                largestKey = largestKey + key;
            }
        }

        return largestKey.charAt(0);
    }
}
