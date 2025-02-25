package L10;

import java.util.ArrayList;

public class ArrayListJava {
    public static void main(String[] args) {

//        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> languages = new ArrayList<>();

        //add elements
        languages.add("vishwajeet");
        languages.add("Vaibhavi");
        languages.add("Sahil");
        languages.add(1,"Shivam");

        System.out.println(languages);

        //access

        String str = languages.get(1);
        System.out.println(str);

        //change

        languages.set(2,"ketaki");
        System.out.println(languages);

        //remove

        System.out.println(languages.size());
    }
}
