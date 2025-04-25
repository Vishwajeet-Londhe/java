package Leetcode;

public class IsomorphicStrings205 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        String s1 = "foo";
        String t1 = "bar";

        String s2 = "paper";
        String t2 = "title";

        System.out.println(isIsomorphic(s,t));
        System.out.println(isIsomorphic(s1,t1));
        System.out.println(isIsomorphic(s2,t2));
    }

    public static boolean isIsomorphic(String s, String t) {
        int[] mapST = new int[256]; // s → t
        int[] mapTS = new int[256]; // t → s

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (mapST[chS] == 0 && mapTS[chT] == 0) {
                mapST[chS] = chT;
                mapTS[chT] = chS;
            } else {
                if (mapST[chS] != chT || mapTS[chT] != chS) {
                    return false;
                }
            }
        }

        return true;
    }
}
