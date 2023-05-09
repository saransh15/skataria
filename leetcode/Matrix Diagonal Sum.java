class Solution {
    public int diagonalSum(int[][] mat) {
        int primary =0;
        int secondary=0;
        for(int i=0;i<mat.length;i++){
            primary += mat[i][i];
            if(i == mat.length-i-1){
                continue;
            }
            secondary += mat[i][mat.length-i-1]; 
        }
        //System.out.println(primary);
        //System.out.println(secondary);
        return primary+secondary;
    }
}
