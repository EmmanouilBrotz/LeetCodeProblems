import java.util.Arrays;

public class maximumNumberofWordsFoundinSentences {
    public static void main(String[] args) {
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too","this is great thanks very much"}; // expected output: 6
        System.out.println("Sentences given: " + Arrays.toString(sentences));
        System.out.println("Most words found in a sentence: " + mostWordsFound(sentences));
    }
    protected static int mostWordsFound(String[] sentences){
        int count = 0;
        for(String sentence: sentences){
            String[] splitSentence = sentence.split(" ");
            if(splitSentence.length > count){
                count = splitSentence.length;
            }
        }
        return count;
    }
}
