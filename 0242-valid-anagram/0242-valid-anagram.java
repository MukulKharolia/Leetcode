class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        String str=s+t;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length()/2;i++){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }
        for(int j=str.length()/2;j<str.length();j++){
            hm.put(str.charAt(j),hm.getOrDefault(str.charAt(j),0)-1);
        }
        for(Character k:hm.keySet()){
            if(hm.get(k)!=0){
                return false;
            }
        }
        return true;
    }
}