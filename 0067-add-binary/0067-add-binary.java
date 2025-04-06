class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder sb=new StringBuilder();
        int c=0;
        while(i>=0 && j>=0){
            int m=a.charAt(i)-'0';
            int n=b.charAt(j)-'0';
            int s=m+n+c;
            if(s==2){
                s=0;
                c=1;
            }
            else if(s==3){
                s=1;
                c=1;
            }
            else{
                c=0;
            }
            sb.append(s);
            i--;
            j--;
        }
        while(i>=0){
            int m=a.charAt(i)-'0';
            int s=m+c;
            if(s==2){
                s=0;
                c=1;
            }
            else{
                c=0;
            }
            sb.append(s);
            i--;
        }
        while(j>=0){
            int m=b.charAt(j)-'0';
            int s=m+c;
            if(s==2){
                s=0;
                c=1;
            }   
            else{
                c=0;
            }
            sb.append(s);
            j--;
        }
        if(c==1){
            sb.append(1);
        }
        sb.reverse();
        return sb.toString();
    }
}