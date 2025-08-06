package day7;

public class pangram {
    public static void main(String[] args) {
        
    
        String s = "the quick brown fox jumps over the lazy dog";
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            if(ch!=' ')
            freq[ch - 'a']+=1;
    }
        boolean ispangram = true;
        for(int i = 0; i<freq.length-1; i++){
            if(freq[i] == 0){
                ispangram = false;
                break;
            }
        }
        if(ispangram){
            System.out.println("pangram string");
        }
        else{
            System.out.println("not a panrgam string");
        }

}
}

