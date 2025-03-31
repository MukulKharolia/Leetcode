class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<t.length();i++){
            hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)+1);
        }

        int left=0;
        int right=0;
        int minSize=Integer.MAX_VALUE;
        int minLeft=0;

        int size=hm.size();
        int co=0;

        HashMap<Character,Integer> win=new HashMap<>();

        while(right<s.length()){
            char c=s.charAt(right);
            win.put(c,win.getOrDefault(c,0)+1);

            if(hm.containsKey(c) && win.get(c).intValue()==hm.get(c).intValue()){
                co++;
            }

            while(left<=right && co==size){
                if(right-left+1<minSize){
                    minSize=right-left+1;
                    minLeft=left;
                }

                char lChar=s.charAt(left);
                win.put(lChar,win.get(lChar)-1);

                if(hm.containsKey(lChar) && win.get(lChar)<hm.get(lChar)){
                    co--;
                }
                left++;
            }
            right++;
        }

        return minSize==Integer.MAX_VALUE ? "" : s.substring(minLeft,minLeft+minSize);
    }
}