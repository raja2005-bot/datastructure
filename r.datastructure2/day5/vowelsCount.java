package day5;

public class vowelsCount {
    public static void main(String[] args) {
        String s = "abcdefghijkl";
        int count = 0;
        int cons = 0;
        char c[] = s.toCharArray();
        for(char ch : c){
            if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count = count+1;
            }
            else{
                cons= cons+1;
            }
        }
        System.out.println(count);
        System.out.println(cons);
    }
}
