class Solution {
    public String convert(String s, int numRows) {
        if(numRows ==1){
            return s;
        }
        StringBuilder[] sb =new StringBuilder[numRows];
         for(int i =0;i <numRows ;i++){
            sb[i]=new StringBuilder();
        }
        int curr = 0;
        int dir = 1;
        for(char c : s.toCharArray()){
            sb[curr].append(c);
            if(curr==0){
                dir = 1;
            }
            else if(curr==numRows- 1) {
                dir = -1;
            }
            curr+= dir;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : sb)
            res.append(row);
        return res.toString();
    }
}