package day6;

import java.util.Arrays;

public class CharSum {
    public static void main(String[] args) {
        String s = "abcd"; 
        // int ASCIIsum = 0; int Position = 0;
        // for(char ch : s.toCharArray()){
        //     ASCIIsum = ASCIIsum +(int)(ch);
        //     Position =( (int)(ch) - 96 ) + Position;
        // }
        // System.out.println("Ascii value sum :" + ASCIIsum);
        // System.out.println("positon sum is : "+Position);
        char []ch = s.toCharArray();
        // for(int i =0; i<ch.length; i++){
        //     int val= ch[i];
        //     if(val == 'z'){
        //         val = 'a';
        //     }
        //     else{
        //         val = val+1;
        //     char ch1 = (char)val;
        //     ch[i] = ch1;
        //     }
        // }
        //      System.out.println(Arrays.toString(ch));
        for(int i = 0; i<ch.length;i++){
            ch[i] = (ch[i] == 'z')?'a':(char)(ch[i]+1);
        }
        System.out.println(Arrays.toString(ch));

}
}
