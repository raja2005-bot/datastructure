package day5;
import java.util.*;
public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        int other = 0;
        char letter[] = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(letter[i]== 'a'){
                count = count+1;
            }
            else{
                other = other+1;
            }
        }
        System.out.println("Letters of a in the string is : "+count);
        System.out.println("Other letters rathe than a is : "+other);
        sc.close();
    }
}
