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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        ListNode current=head;
        int len=1;
        while(current.next!=null){
            current=current.next;
            len++;      
              }
              current.next=head;
               k = k % len;
              int tmp = len - k;
              ListNode fin = current;
        while (tmp-- > 0) {
            fin = fin.next;
        }
         ListNode disp = fin.next;
        fin.next = null;
        return disp;


    }
}