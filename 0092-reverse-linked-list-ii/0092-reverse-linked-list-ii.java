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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        int i=1;
        ListNode temp=head;
        ListNode p=null;
        while(i!=left){
            p=temp;
            temp=temp.next;
            i++;
        }
        ListNode curr=temp;
        ListNode prev=p;
        ListNode next;
        ListNode n=null;
        while(i!=right+1){
            n=curr.next;
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            i++;
        }
        temp.next=curr;
        if(left>1){
            p.next=prev;
        }
        else{
            return prev;
        }
        
        return head;
        
    }
}