package day6;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        String s = "aabbccddefhg";
        ArrayList<Character> clist = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if(!clist.contains(character)){
                clist.add(character);
            }
        }
        System.out.println(clist);
    }
}
