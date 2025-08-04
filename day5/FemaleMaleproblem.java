package day5;

public class FemaleMaleproblem {
    public static void main(String[] args) {
        String s = "ffmmffm";
        int f = 0;
        int m = 0;
        char c[] = s.toCharArray();
        for(char ch:c){
            if(ch == 'f'){
                f=f+1;
            }
            else{
                m=m+1;
            }
        }
        System.out.println("Total number of Females : "+f);
        System.out.println("Total number of males : "+m);
    }
}
