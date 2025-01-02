import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int len=s.length();
        int i=0,j=10;
        HashMap<String,Integer> mp = new HashMap<>();
        List<String> ans=new ArrayList<>();
        if(len<10){
            return ans;
        }
        while(j<=len){
            String cur=s.substring(i,j);
                
            mp.put(cur,mp.getOrDefault(cur,0)+1);
            

            if(mp.get(cur)==2){
                    ans.add(cur);
            }
            i++;j++;
        }
        return ans;
    }
}