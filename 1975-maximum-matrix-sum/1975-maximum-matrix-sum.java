class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum= 0;
        int count= 0;
        int min =Integer.MAX_VALUE;
        for(int i = 0;i <matrix.length;i++){
            for(int j =0;j <matrix[0].length;j++){
                int mat = matrix[i][j];
                if(mat< 0){
                    count++;
                }
                int absVal = Math.abs(mat);
                sum+=absVal;
                min =Math.min(min,absVal);
            }
        }
        if(count %2 !=0){
            sum-=2 *min;
        }
        return sum;
    }
}