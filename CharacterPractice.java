//Word Count: Count the number of words in the string.

// Character Count: Count the number of characters (including spaces and punctuation).

// Letter Frequency: Count how many times each letter appears in the string (case-insensitive).

// Most Common Letter: Identify the most frequently occurring letter.

// Reverse the String: Display the string in reverse order.

import java.util.HashMap;

public class CharacterPractice{
    public static void main(String[] args){
        //sample string
        String text = "The grass withers, the flower fades, but the word of our God will stand forever.";
        int wordCountResult = wordCount(text);
        System.out.println("Word Count: " + wordCountResult);
        int charCountResult = charCount(text);
        System.out.println("Character Count: " + charCountResult);
    }

    public static int wordCount(String text){
        text = text.trim(); // get rid of unneccessary frontward and backward white space
        if(text.isEmpty()) //if no text
            return 0;
        int count = 1; //assuming there is atleast one word
        for(int i = 0; i < text.length(); i++){ //iterate through the entire string
            if(text.charAt(i) == ' ') //assuming a space signifies a word
                count++;
        }
        return count;
    }

    public static int charCount(String text){ //no trim if 'blanks' are used
        if(text.isEmpty())
            return 0;
        int count = 0;
        for(int i = 0; i < text.length(); i++)
            count++;
        return count;
    }
}
