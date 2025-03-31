class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        String n="";
        HashSet<Integer> val=new HashSet<>();
        Stack<Integer> si=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                val.add(i);
                si.push(i);
            }
            if(!st.isEmpty()){
                if(st.peek()=='(' && s.charAt(i)==')'){
                    st.pop();
                    si.pop();
                    val.add(i);
                }
            }
        }
        while(!si.isEmpty()){
            val.remove(si.pop());
        }
        int l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)==')'){
                if(l<val.size()){
                    if(val.contains(i)){
                        l++;
                        n+=s.charAt(i);
                    }
                    else{
                        continue;
                    }
                }
            }
            if(s.charAt(i)!='(' && s.charAt(i)!=')'){
                n+=s.charAt(i);
            }
        }
        return n;
    }
}