class Solution {
    public int findTheWinner(int n, int k) {
        int winner=1;
        if(n==1) return winner;

        for(int group=2;group<=n;group++){
            winner=((winner+k-1)%group)+1;
        }
        return winner;
    }
}
//https://leetcode.com/problems/find-the-winner-of-the-circular-game/