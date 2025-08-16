class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int l=0;
        int r=0;
        int max=0;
        while(r<fruits.length){
            hm.put(fruits[r], hm.getOrDefault(fruits[r], 0) + 1);
            while(hm.size()>2 ){
                // System.out.println("hi");
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0){
                    hm.remove(fruits[l]);
                    l++;
                    break;
                }
                l++;
            }
            int len=r-l+1;
            max=Math.max(len,max);
            // System.out.println(l+" "+r+" " +max);
            r++;
        }
        // System.out.println(hm);
        return max;
    }
}