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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy=new ListNode(0);
       dummy.next=head;
       ListNode current=dummy;
       ListNode c=head;
       int count =0;
        while(c!=null){
            count++;
            c=c.next;
        }
        count=count-n;
        int check=0;
        while(current.next!=null){
            if(check==count)
            current.next=current.next.next;
            else
            current=current.next;
            check++;
        }
        return dummy.next;
    }
}