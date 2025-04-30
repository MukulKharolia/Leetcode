class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr=new int[nums.length];
        Stack<Integer> s=new Stack<>();
        for(int i=nums.length*2;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=nums[i%nums.length]){
                s.pop();
            }
            if(i<nums.length){
                arr[i]=s.isEmpty()? -1:s.peek();
            }
            s.push(nums[i%nums.length]);
        }
        return arr;
    }
}