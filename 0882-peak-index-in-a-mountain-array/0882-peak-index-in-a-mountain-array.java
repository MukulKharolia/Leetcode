class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st=0;
        int n=arr.length;
        int en=n-1;
        int mid=0;
        while(st<=en){
            mid=st-(st-en)/2;
            if(mid-1>=0 && mid+1<n && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                st=mid+1;
            }
            else if(arr[mid]<arr[mid-1]){
                en=mid-1;
            }

        }
        return mid;
    }
}