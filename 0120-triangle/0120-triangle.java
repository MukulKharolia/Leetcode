class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==1){
            return triangle.get(0).get(0);
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i<triangle.size();i++){
            for(int j=0;j<triangle.get(i).size();j++){
                if(j-1<0){
                    triangle.get(i).set(j,triangle.get(i).get(j)+triangle.get(i-1).get(j));
                }
                else if(triangle.get(i-1).size()==j){
                    triangle.get(i).set(j,triangle.get(i).get(j)+triangle.get(i-1).get(j-1));
                }
                else{
                    triangle.get(i).set(j,Math.min(triangle.get(i-1).get(j-1)+triangle.get(i).get(j),triangle.get(i-1).get(j)+triangle.get(i).get(j)));
                }
                // triangle.get(i).set(j,Math.min(triangle.get(i-1).get(j-1),triangle(.get(i-1).get(j))));
            }
        }
        for(int i=0;i<triangle.get(triangle.size()-1).size();i++){
            if(min>triangle.get(triangle.size()-1).get(i)){
                min=triangle.get(triangle.size()-1).get(i);
            }
        }
        return min;
    }
}