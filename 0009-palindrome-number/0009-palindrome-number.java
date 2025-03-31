class Solution {
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        int i=0;
        while(i<=str.length()/2-1){
           if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
           }
           else{
               i++;
           }
        }
        return true;  
    }
}