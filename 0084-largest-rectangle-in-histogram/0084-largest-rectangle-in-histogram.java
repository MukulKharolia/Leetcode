class Solution {
    public int largestRectangleArea(int[] heights) {
        int ma=0;
        Stack<Integer> s=new Stack<>();
        int n=heights.length;
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>heights[i]){
                int ind=s.pop();
                int nse=i;
                int pse=s.isEmpty()? -1:s.peek();
                ma=Math.max(ma,heights[ind]*(nse-pse-1));
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            int nse=n;
            int ind=s.pop();
            int pse=s.isEmpty()? -1:s.peek();
            ma=Math.max(ma,heights[ind]*(nse-pse-1));
        }
        return ma;

    }
}