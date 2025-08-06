package day6;

public class letterFreqCount {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char rep = 'g'; String repeated = "";
        int count = 0;
        char []ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i] == rep){
                repeated = repeated+ch[i];
                count = count+1;
            }
        }
        System.out.println("Repeated " + repeated);
        System.out.println("Total words repeated "+count);
    }
}
