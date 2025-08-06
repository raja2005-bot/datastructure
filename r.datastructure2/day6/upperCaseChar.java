package day6;

import java.util.Arrays;

public class upperCaseChar {
    public static void main(String[] args) {
        String s = "AbCdEfGh";
        // String result = "";
        char ch[] = s.toCharArray();
        System.out.println(Arrays.toString(ch));
        for(int i =0; i<ch.length; i++){
            if(Character.isUpperCase(ch[i]) == true){
                ch[i] = Character.toLowerCase(ch[i]);
            }
            else if(Character.isLowerCase(ch[i]) ==true){
                ch[i] = Character.toUpperCase(ch[i]);
            }
            // result = result+ch[i];
        }
        // System.out.println(result);
        System.out.println(Arrays.toString(ch));
        String newString = new String(ch);
        System.out.println(newString);
        
    }
}
