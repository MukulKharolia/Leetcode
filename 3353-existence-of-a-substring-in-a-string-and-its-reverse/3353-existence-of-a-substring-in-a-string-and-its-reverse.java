class Solution {
    public boolean isSubstringPresent(String s) {
        HashSet<String> hs=new HashSet<>();
        HashSet<String> map=new HashSet<>();
        for(int i=0;i<s.length()-1;i++){
            int j=2;
            int k=i;
            int m=s.length()-1-i;
            int n=m;
            String substr="";
            String substr1="";
            while(j>0){
                substr+=s.charAt(k);
                substr1+=s.charAt(n);
                k++;
                j--;
                n--;
            }
            hs.add(substr);
            map.add(substr1);
        }
        for(String l:hs){
            if(map.contains(l)){
                return true;
            }
        }
        return false;
    }
}