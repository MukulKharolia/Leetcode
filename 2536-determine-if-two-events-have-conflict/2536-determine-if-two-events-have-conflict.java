class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        String h1=hour(event1[0]);
        String h2=hour(event1[1]);
        String h3=hour(event2[0]);
        String h4=hour(event2[1]);
        String m1=min(event1[0]);
        String m2=min(event1[1]);
        String m3=min(event2[0]);
        String m4=min(event2[1]);
        String t1=h1+m1;
        String t2=h2+m2;
        String t3=h3+m3;
        String t4=h4+m4;
        int e1=time(t1);
        int e2=time(t2);
        int e3=time(t3);
        int e4=time(t4);
        // System.out.println(e1);
        // System.out.println(e2);
        // System.out.println(e3);
        // System.out.println(e4);
        if(e1<e3){
            if(e2>=e3){
                return true;
            }
            else{
                return false;
            }
        }
        else if(e1==e3){
            if(e2>=e3){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(e4>=e1){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public int time(String s){
        return Integer.valueOf(s);
    }

    public String hour(String s){
        String n="";
        n+=s.charAt(0);
        n+=s.charAt(1);
        // String n=(char)s.charAt(0)+(char)s.charAt(1);
        return n;
    }

    public String min(String s){
        String n="";
        n+=s.charAt(3);
        n+=s.charAt(4);
        // String n=(char)s.charAt(3)+(char)s.charAt(4);
        return n;
    }
}