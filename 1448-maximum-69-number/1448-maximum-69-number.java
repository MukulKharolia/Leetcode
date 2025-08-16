class Solution {
    public int maximum69Number (int num) {
        String str=String.valueOf(num);
        StringBuilder sb=new StringBuilder(str);
        // System.out.println(sb.toString());
        // int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='6'){
                sb.setCharAt(i,'9');
                break;
            }
        }
        // System.out.println(sb.toString());
        
        return Integer.valueOf(sb.toString());
    }
}