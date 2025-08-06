package day7;

public class HighestLengthofTheWord {
    public static void main(String[] args) {
        
    
        String line = "Madam speaks malayalam very well said dad";
        String words[] = line.split(" ");

            int bindex = 0 ;
            for(int i = 1; i<words.length; i++){
                if(words[i].length() > words[bindex].length());
                {
                    bindex = i;
                }

    }
    System.out.println(words[bindex]);
}
}
