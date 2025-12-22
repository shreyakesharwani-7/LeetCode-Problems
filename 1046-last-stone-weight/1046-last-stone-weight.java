class Solution {
public int lastStoneWeight(int[] s) {
List<Integer> a=new ArrayList<>();
    for(int x:s){
        a.add(x);
    }
    while(a.size()>1)
    {
        Collections.sort(a);
        int y=a.remove(a.size()-1);
        int x=a.remove(a.size()-1);
        if(y!=x){
            a.add(y-x);
        }
    }   
        return a.size()==0?0:a.get(0);
    }
}