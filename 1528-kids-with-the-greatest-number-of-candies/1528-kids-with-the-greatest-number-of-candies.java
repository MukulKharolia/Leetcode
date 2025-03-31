class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        int great=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>great){
                great=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=great){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}