import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class wordsContainingChar {
    public static void main(String[] args) {
        String[] words = new String[]{"abc","abcd","aaaa","cbc"};
        char character = 'a';
        System.out.println("indices returned: " + findWordsContaining(words, character));
    }
    protected static List<Integer> findWordsContaining(String[] words, char x){
        List<Integer> result = new ArrayList<>(); // result arraylist that will store the indices
        for(int i =0; i < words.length; i++){
            if(words[i].contains(String.valueOf(x))){ // if it contains x
                result.add(i); // add the index (which is essentially i) into the list
            }
        }
        return result;
    }

}
