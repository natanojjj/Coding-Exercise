public class CharacterPractice2{
    public static void main (String[] args){
        String text = "Surely he has borne our griefs and carried our sorrows; yet we esteemed him stricken, smitten by God, and afflicted. But he was pierced for our transgressions; he was crushed for our iniquities; upon him was the chastisement that brought us peace, and with his wounds we are healed. All we like sheep have gone astray; we have turned — every one — to his own way; and the LORD has laid on him the iniquity of us all.";
        
        int numSentence = sentenceCount(text);
        System.out.println(numSentence);
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
}