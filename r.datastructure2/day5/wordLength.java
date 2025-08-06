package day5;
import java.util.Arrays;
public class wordLength {
    public static void main(String[] args) {
        String s = "Hello World in Programming Java";
        // String word[] = s.split(" ");
        String[] c = s.split(" ");
        System.out.println(Arrays.toString(c));
        String s1 = " ";
        for(String word : c){
            for(char ch : word.toCharArray()){
                s1 = ch + s1;;
            }
            if(s1.equals(word)){
                System.out.println("Palindrome "+ word.length());
            }
            else{
                System.out.println("not a palindrome " + word.length());
            }
        }
        
        






























        // System.out.println(word.length);
        // System.out.println(word[word.length-1]);
        // System.out.println(word[word.length-1].length());
        
        
        
    //     String hi = "";
    //     for(int i =word.length-1; i>=0; i-- ){
    //         hi = hi+ word[i];
    //     }
    //     System.out.println(hi);


    // }
}
}
