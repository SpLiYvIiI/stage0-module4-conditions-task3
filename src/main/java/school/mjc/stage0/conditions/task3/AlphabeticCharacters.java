package school.mjc.stage0.conditions.task3;

import java.util.Arrays;
public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')){
            if(Arrays.asList('a','e','i','o','u').contains(character)){
                System.out.println("Vowel");
            }
            else
                System.out.println("Consonant");
        }
        else
            System.out.println("wrong alphabet!");
    }
}
