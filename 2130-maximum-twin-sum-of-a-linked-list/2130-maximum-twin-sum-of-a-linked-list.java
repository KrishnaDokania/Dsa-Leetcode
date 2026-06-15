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
    public int pairSum(ListNode head) {
        ListNode current=head;
        Stack<Integer>st=new Stack<>();
        while(current!=null){
            st.push(current.val);
            current=current.next;
        }
        int len=st.size()/2;
        current=head;
        int max=0;
        while(len>0){
            max=Math.max(max,current.val+st.pop());
            current=current.next;
            len--;
        }
        return max;
    }
}