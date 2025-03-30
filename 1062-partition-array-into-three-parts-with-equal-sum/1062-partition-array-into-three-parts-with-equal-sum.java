class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        // System.out.println(sum);
        if(sum%3!=0){
            return false;
        }
        int prt=sum/3;
        int count=0;
        int rsum=0;

        for(int i=0;i<arr.length;i++){
            rsum+=arr[i];
            if(rsum==prt){
                count++;
                rsum=0;
            }
            if(count==2 && i<arr.length-1){
                return true;
            }
        }
        // System.out.println(count);
        // if(count==3){
        //     return true;
        // }
        // System.out.println(-1);
        return false;
    }
}