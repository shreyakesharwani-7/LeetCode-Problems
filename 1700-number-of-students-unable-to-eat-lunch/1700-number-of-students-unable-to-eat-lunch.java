class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<students.length;i++){
          q.add(i);
        }
        int i=0;
        int j=0;
        while (!q.isEmpty() && j<q.size()){
            if (students[q.peek()] == sandwiches[i]){
             q.poll();
              i++;
              j=0;
            }
            else{
                q.add(q.poll());
                j++;
            }
        }
        return q.size();
    }
}