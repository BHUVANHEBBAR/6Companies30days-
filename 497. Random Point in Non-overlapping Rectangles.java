import java.util.Random;
import java.util.TreeMap;

class Solution {
    Random ran=new Random();
    int[][]rects;
    TreeMap<Integer,Integer> mp;
    int sum;
    public Solution(int[][] rects) {
        this.rects=rects;
        mp=new TreeMap<>();    
        sum=0;

        for(int i=0;i<rects.length;i++){
            int []rect=rects[i];
            sum+=(rect[2]-rect[0]+1) * (rect[3]-rect[1]+1);
            mp.put(sum,i);
        }
    }
    
    public int[] pick() {
        int num = mp.ceilingKey(ran.nextInt(sum)+1);
        int[] xy=rects[mp.get(num)];
        return new int[]{xy[0]+ran.nextInt(xy[2]-xy[0]+1),xy[1]+ran.nextInt(xy[3]-xy[1]+1)};
    }
}
