package Leetcode;
import java.util.List;
import java.util.ArrayList;

public class FindWordContainigChar2942 {
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';

        String[] words1 = {"abc","bcd","aaaa","cbc"};
        char x1 = 'a';

        String[] words2 = {"anu", "vaibhu", "akku", "apurva", "tanu", "vishwajeet"};
        char x2 = 'v';

        System.out.println(findWordsContaining(words,x));
        System.out.println(findWordsContaining(words1,x1));
        System.out.println(findWordsContaining(words2,x2));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {

        ArrayList<Integer> result = new ArrayList<>();
        for(int i =0;i<words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                result.add(i);
            }
        }

        return result;
    }
}
