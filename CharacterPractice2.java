import java.util.HashSet;
import java.util.Arrays;

public class CharacterPractice2{
    public static void main (String[] args){
        String text = "Surely he has borne our griefs and carried our sorrows; yet we esteemed him stricken, smitten by God, and afflicted. But he was pierced for our transgressions; he was crushed for our iniquities; upon him was the chastisement that brought us peace, and with his wounds we are healed. All we like sheep have gone astray; we have turned — every one — to his own way; and the LORD has laid on him the iniquity of us all.";
        
        int numSentence = sentenceCount(text);
        System.out.println(numSentence);

        //Exercise 1: Basic split() Practice:
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

        
    }
    public static int sentenceCount(String text){
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(isSentence(c))
                count++;
        }
        return count;
    }
    public static boolean isSentence(char text){
        if(text == '.' || text == '?'  || text == '!')
            return true;
        return false;
    }

    // public static HashSet<String> uniqueWords(String text){
    //     text = text.toLowerCase();
    //     return text;
    // }
}