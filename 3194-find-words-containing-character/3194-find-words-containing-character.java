class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int k=0;k<s.length();k++){
                if(s.charAt(k)==x){
                    arr.add(i);
                    break;
                }
            }
        }
        return arr;
    }
}