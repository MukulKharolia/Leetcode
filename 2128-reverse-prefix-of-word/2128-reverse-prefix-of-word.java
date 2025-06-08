class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> s=new Stack<>();
        int i=0;
        boolean cum=false;
        while(i<word.length()){
            s.push(word.charAt(i));
            if(ch==word.charAt(i)){
                cum=true;
                i++;
                break;
            }
            i++;
        }
        if(!cum){
            return word;
        }
        StringBuilder sb=new StringBuilder();
       while(!s.isEmpty()){
            sb.append(s.pop());
       }
       while(i<word.length()){
        sb.append(word.charAt(i));
        i++;
       }
       return sb.toString();
    }
}