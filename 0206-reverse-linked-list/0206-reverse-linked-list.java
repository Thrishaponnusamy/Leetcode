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
    public ListNode reverseList(ListNode head) {
        ListNode c = head;
        ListNode p =null ;
        ListNode next=null;
        while(c!=null){
            next=c.next;
            c.next=p;
            p=c;
            c=next;
        }
        head=p;
return head;
        
    }
}