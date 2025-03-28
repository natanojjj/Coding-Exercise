import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class CharacterPractice2{
    public static void main (String[] args){
        String text = "Surely he has borne our griefs and carried our sorrows; yet we esteemed him stricken, smitten by God, and afflicted. But he was pierced for our transgressions; he was crushed for our iniquities; upon him was the chastisement that brought us peace, and with his wounds we are healed. All we like sheep have gone astray; we have turned — every one — to his own way; and the LORD has laid on him the iniquity of us all.";
        
        
        //(Preliminary) Exercise 1: Basic split() Practice:

        /* 
        String text1 = "The quick brown fox";
        String[] words1 = text1.split(" ");//split by spaces and append words to array
        System.out.println(Arrays.toString(words1));

        String text2 = "apple,banana,orange";
        String[] fruits = text2.split(",");//split by commas
        System.out.println(Arrays.toString(fruits));

        String text3 = "Hello, world! How are you?";
        String[] words3 = text3.split("[ ,]");//split by space or comma
        System.out.println(Arrays.toString(words3));

        //Exercise 2: Further Regex Practice
        String text4 = "Hello.World!How?Are.You";
        String[] words4 = text4.split("[.!?]"); //spliting by punctuation points
        System.out.println(Arrays.toString(words4));

        String text5 = "A1B2C3D";
        String[] words5 = text5.split("[0-9]");
        System.out.println(Arrays.toString(words5));

        //Exercise 3: replaceAll() practice
        String text6 = "Order123 placed456";
        String fixed1 = text6.replaceAll("[0-9]",""); //get rid of all digits
        System.out.println(fixed1);

        String text7 = "Hello World";
        String fixed2 = text7.replaceAll("[aeiouAEIOU]","*"); //replaces all vowels with *
        System.out.println(fixed2);
        
        String text8 = "R2-D2 is a droid!";
        String fixed3 = text8.replaceAll("[^a-zA-Z]", "");
        System.out.println(fixed3);

        //Exercise 4: Combine split() and replaceAll()
        String text9 = "apple, banana; orange|grape";
        String[] fruits2 = text9.replaceAll("[^a-zA-Z]"," ").split("\\s+");
        //for context \\s+ = trim() (excess white space)
        //furthermore \\s* = trim() but will split every single letter
        System.out.println(Arrays.toString(fruits2));

        //Exercise 5: Real-World Problem (Extract Hashtags!)
        String caption = "Java is #awesome! #coding #learn";
        caption = caption.replaceAll("[^a-zA-Z#]", " "); //remove all non-characters and non-hashtags
        String[] hashtags = caption.split("\\s+"); //remove white space and append to hashtag
        List<String> filteredHashtags = new ArrayList<>();
        for (String word : hashtags) { //iterate through the original hashtag array
            if (word.startsWith("#")) {
                filteredHashtags.add(word);
            }
        }
        System.out.println(filteredHashtags);
        */
        int numSentence = sentenceCount(text);
        System.out.println(numSentence);

        HashSet<String> wordList = uniqueWords(text);
        System.out.println(wordList);

        int numPunctuation = punctuationCount(text);
        System.out.println(numPunctuation);

        int[] numVowel = vowelConsonantCount(text);
        System.out.println(Arrays.toString(numVowel));

    }

    public static int sentenceCount(String text){
        if (text.isEmpty())
            return 0;
        String[] sentence = text.split("[.!?]");
        return sentence.length;
    }
    public static boolean isSentence(char text){
        if(text == '.' || text == '?'  || text == '!')
            return true;
        return false;
    }

    public static HashSet<String> uniqueWords(String text){
        text = text.toLowerCase().trim();
        String[] words = text.split("[^a-zA-Z']"); //split everything that's not a character. except for contraction's
        HashSet<String> uniqueWordsList = new HashSet<String>();
        for(String word : words){
            if (word.length() > 1 || word.equals("a") || word.equals("i")) //takes away wierd single letter case
            uniqueWordsList.add(word);
        }
        return uniqueWordsList;
    }

    public static int punctuationCount(String text){
        text = text.trim();
        String[] punctuationArray = text.split("[.,!?;:\"'()\\-_]");
        int count = 0;
        for (String word : punctuationArray) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count; //regex counts last space as an empty space
    }


    // //bro I was just mess around this method suck runtime O(n^2)
    // public static int[] vowelConsonantCount(String text){
    //     text = text.trim().toLowerCase();
    //     //first filter out non-character
    //     text = text.replaceAll("[^a-z]", "");
    //     String[] consonantArray = text.split("[aeiou]");
    //     int consonantCount = 0;
    //     for (String word : consonantArray){
    //         if (!word.isEmpty()){
    //             consonantCount++;
    //         }
    //     }
    //     String[] vowelArray = text.split("[^aeiou]");
    //     int vowelCount = 0;
    //     for (String word : vowelArray){
    //         if(!word.isEmpty()){
    //             vowelCount++;
    //         }
    //     }
    //     return new int[] {vowelCount, consonantCount};
    // }
    public static int[] vowelConsonantCount(String text){
        text = text.trim().toLowerCase().replaceAll("[^a-z]",""); //quickly remove all non-characters
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if("aeiou".indexOf(c) != -1) //if character = -1 then character isn't a vowel, so not not a vowel
                vowelCount++;
            else
                consonantCount++; //else character is a vowel
        }
        return new int[] {vowelCount, consonantCount};
    }
}