class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(String i:operations){ 
            if(i.charAt(0)=='+' || i.charAt(2)=='+'){
                count++;
            }
            if(i.charAt(0)=='-' || i.charAt(2)=='-'){
                count--;
            }
        }
        return count;
    }
}