class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        for(int num:hm.keySet()){
            if(hs.contains(hm.get(num))){
                return false;
            }
            hs.add(hm.get(num));
        }
        return true;
    }
}