class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> set =new HashSet<>();
        for(int i:nums1){
            hs.add(i);
        }
        for(int j:nums2){
            if(hs.contains(j)){
                set.add(j);
            }
        }
        int count=set.size();
        int[] arr=new int[count];
        count--;
        for(Integer y:set){
            arr[count]=y;
            count--;
        }
        return arr;
    }
}