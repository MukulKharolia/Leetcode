class Solution {
    public List<String> letterCasePermutation(String s) {
        StringBuilder sb=new StringBuilder();
        List<String> arr=new ArrayList<>();
        res(s,arr,sb,0);
        // System.out.println(arr);
        return arr;
    }
    public static void res(String s, List<String> arr, StringBuilder sb,int i){
        if(sb.length()==s.length()){
            arr.add(sb.toString());
            return;
        }
        sb.append(Character.toLowerCase(s.charAt(i)));
        res(s,arr,sb,i+1);
        sb.deleteCharAt(sb.length()-1);
        if(s.charAt(i)>='0' && s.charAt(i)<='9'){
            return;
        }
        sb.append(Character.toUpperCase(s.charAt(i)));
        res(s,arr,sb,i+1);
        sb.deleteCharAt(sb.length()-1);
        //  if (Character.isLetter(s.charAt(i))) {
        //     sb.append(Character.toUpperCase(s.charAt(i)));
        //     res(s, arr, sb, i + 1);
        //     sb.deleteCharAt(sb.length() - 1); // IMPORTANT: backtrack here too
        // }
    }
}