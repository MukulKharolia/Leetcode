class Solution {
    public int mostWordsFound(String[] sentences) {
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int i=0;i<sentences.length;i++){
            int count=1;
            String s=sentences[i];
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' '){
                    count++;
                }
            }
            pq.add(count);
        }
        return pq.peek();
    }
}