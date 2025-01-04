class Solution {
    public int[][] imageSmoother(int[][] img) {
        int rows = img.length;
        int cols = img[0].length;

        int [][]smooth = new int[rows][cols];
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                smooth[r][c]=calc(img,r,c,rows,cols);
            }
        }
        return smooth;
    }

    private int calc(int [][] img,int r,int c,int rows,int cols){
        int sum=0;int count =0;
        int top=Math.max(0,r-1);
        int bottom = Math.min(rows,r+2);
        int left=Math.max(0,c-1);
        int right=Math.min(cols,c+2);

        for(int row=top;row<bottom;row++){
            for(int col=left;col<right;col++){
                sum+=img[row][col];
                count++;
            }
        }
        return sum/count;
    }
}