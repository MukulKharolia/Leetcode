class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            reverse(image[i]);
            invert(image[i]);
        }
        return image;
    }
    public static void reverse(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }

    public static void invert(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=1;
            }
            else{
                arr[i]=0;
            }
        }
    }
}