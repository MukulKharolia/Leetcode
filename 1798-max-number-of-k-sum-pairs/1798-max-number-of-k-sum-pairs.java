class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int ope=0;
        for(int n:nums){
            if(hm.containsKey(n) && hm.containsKey(k-n) && n!=k-n){
                ope++;
                hm.put(n,hm.get(n)-1);
                hm.put(k-n,hm.get(k-n)-1);
                if(hm.get(n)<=0){
                    hm.remove(n);
                }
                if(hm.containsKey(n) && hm.get(k-n)<=0){
                    hm.remove(k-n);
                }
            }
            else if(n==k-n){
                if(hm.containsKey(n) && hm.get(n)>=2){
                    ope++;
                    hm.put(n,hm.get(n)-2);
                    if(hm.get(n)<=0){
                        hm.remove(n);
                    }
                }
            }
        }
        return ope;
    }
}