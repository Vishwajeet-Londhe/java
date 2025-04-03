package Leetcode;
import java.util.List;
import java.util.ArrayList;

public class FindWordContainigChar2942 {
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';
        System.out.println(findWordsContaining(words,x));
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
