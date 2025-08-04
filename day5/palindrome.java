package day5;

public class palindrome {
    public static void main(String[] args) {
        String s = "MadaM speaks malayalam very well";
        String words[] = s.split(" ");
        for(String word:words){
            StringBuffer sb = new StringBuffer(word);
            String rev = sb.reverse().toString();
            if(rev.equals(word)){
                System.out.println(word + " : Palindrome  " );
            }
            else{
                System.out.println(word+ " : not a Palindrome  ");
            }
        }

    }
}
