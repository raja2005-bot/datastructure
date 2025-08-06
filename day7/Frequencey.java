package day7;

import java.util.ArrayList;
import java.util.Arrays;

public class Frequencey {
    public static void main(String[] args) {
        String str = "leetcode";

        ArrayList<Character> clist = new ArrayList<>();

        int freq[] = new int[26];
        for(char ch : str.toCharArray()){
            freq[ch-'a']+=1;
            if(!clist.contains(ch)) clist.add(ch);     // removes the duplicates
        }
        System.out.println(Arrays.toString(freq));
        for(char ch : clist){
            System.out.println(ch + "-" + freq[ch-'a']);
        }
        // System.out.println(freq.toString());
        // for()
    }
}
