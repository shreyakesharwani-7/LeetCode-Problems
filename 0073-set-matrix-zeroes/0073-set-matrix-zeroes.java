class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(matrix[i][j] == 0)
                {
                    s1.add(i);
                    s2.add(j);
                }
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(s1.contains(i) || s2.contains(j))
                    matrix[i][j] = 0;
            }
        }
    }
}