import java.util.HashMap;

class Solution {
    public int maxProduct(String s) {
        char[] st=s.toCharArray();
        int n=st.length;
        HashMap<Integer,Integer> comb = new HashMap<>();

        for(int mask=0;mask< 1<<n;mask++){
            String sub="";
            for(int i=0;i<12;i++){
                if((mask & 1<<i) > 0)
                    sub+=st[i];
            }
            if(isPal(sub)){
                comb.put(mask,sub.length());
            }
        }
        int res=0;
        for(int mask1:comb.keySet()){
            for(int mask2:comb.keySet()){
                if((mask1 & mask2)==0){
                    res = Math.max(res,comb.get(mask1)*comb.get(mask2));
                }
            }
        }
        return res;
    }
    public boolean isPal(String str){
        int j=str.length()-1;
        char[] sArr = str.toCharArray();
        for(int i=0;i<j;i++){
            if(sArr[i]!=sArr[j])
            return false;

            j--;
        }
        return true;
    }
}