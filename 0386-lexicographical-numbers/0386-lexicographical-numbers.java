class Solution {
    static class Node{
        Node[] children=new Node[10];
        boolean eow=false;
        public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
        }
    }
    public Node root=new Node();
    public List<Integer> lexicalOrder(int n) {
        root=new Node();
        for(int i=1;i<=n;i++){
            insert(Integer.toString(i));
        }
        List<Integer> result = new ArrayList<>();
        dfs(root, "", result);
        return result;

    }
    public void dfs(Node curr, String path, List<Integer> result) {
        if (curr == null) return;
        if (curr.eow) {
            result.add(Integer.parseInt(path));
        }
        for (int i = 0; i <= 9; i++) {
            if (curr.children[i] != null) {
                dfs(curr.children[i], path + i, result);
            }
        }
    }
    public boolean search(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'0';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow==true;
    }

    public void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'0';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
}