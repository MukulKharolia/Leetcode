class Solution {
    public String longestCommonPrefix(String[] strs) {
        int k=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<k){
                k=strs[i].length();
            }
        }
        String s="";
        for(int i=0;i<k;i++){
            char ch=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(ch==strs[j].charAt(i)){
                    int a;
                }
                else{
                    return s;
                }
            }
            s+=ch;
        }
        return s;
    }
}