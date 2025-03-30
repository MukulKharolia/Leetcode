import java.util.*;
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
    public static ListNode head;
    public static ListNode tail;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list=new ListNode(-1);
        ListNode temp=list;
        ListNode t1=l1;
        ListNode t2=l2;
        int carry=0;
        while(t1!=null && t2!=null){
            int d=t1.val+t2.val+carry;
            if(d>9){
                carry=1;
                d=d%10;
                ListNode newNode=new ListNode(d);
                temp.next=newNode;
                temp=temp.next;
            }
            else{
                // add(d);
                carry=0;
                ListNode newNode=new ListNode(d);
                temp.next=newNode;
                temp=temp.next;
            }
            t1=t1.next;
            t2=t2.next;
        }

        while(t1!=null){
            int d=carry+t1.val;
            if(d>9){
                carry=1;
                d=d%10;
            }
            else{
                carry=0;
            }
            ListNode newNode=new ListNode(d);
            temp.next=newNode;
            temp=temp.next;
            t1=t1.next;
        }

        while(t2!=null){
            int d=carry+t2.val;
            if(d>9){
                carry=1;
                d=d%10;
            }
            else{
                carry=0;
            }
            ListNode newNode=new ListNode(d);
            temp.next=newNode;
            temp=temp.next;
            t2=t2.next;
        }
        if(carry==1){
            ListNode newNode=new ListNode(1);
            temp.next=newNode;
            temp=temp.next;
        }
        return list.next;
    }

    // public ListNode add(int val){
    //     ListNode node=new ListNode(val);
    //     if(head==null){
    //         head=tail=node;
    //         return;
    //     }
    //     tail.next=node;
    //     node=tail;
    // }
}