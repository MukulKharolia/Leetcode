/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        if(head==null){
            return 0;
        }
        ArrayList<Integer> arr= new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        int n=0;
        for(int i=arr.size()-1;i>=0;i--){
            n+=arr.get(arr.size()-1-i)*Math.pow(2,i);
        }
        return n;
    }
}