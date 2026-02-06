class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
         recur(candidates, 0, target, curr, res);
        return res;
    }
        public void recur(int []candidates, int i,int target, List<Integer> curr, List<List<Integer>> res){
            if(i==candidates.length){
                if(target == 0){
                res.add(new ArrayList<> (curr));
                }
                return;
            }
            if(candidates[i] <=target){
                curr.add(candidates[i]);
                recur(candidates, i, target-candidates[i], curr, res);
                curr.remove(curr.size()-1);
            }
            recur(candidates, i+1, target, curr, res);
        }
    }