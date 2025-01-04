import java.util.HashMap;

class Solution {
    public String getHint(String secret, String guess) {
        int cows=0,bulls=0;
        String sb="";
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<guess.length();i++){
            if(guess.charAt(i)==secret.charAt(i)){
                bulls++;
            }
            else{
                mp.put(secret.charAt(i),mp.getOrDefault(secret.charAt(i),0)+1);
                
            }
        }
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) != secret.charAt(i)) {
                if (mp.containsKey(guess.charAt(i)) && mp.get(guess.charAt(i)) > 0) {
                    cows++;
                    mp.put(guess.charAt(i), mp.get(guess.charAt(i)) - 1); 
                }
            }
        }
        sb=bulls+"A"+cows+"B";
        return sb;
    }
}