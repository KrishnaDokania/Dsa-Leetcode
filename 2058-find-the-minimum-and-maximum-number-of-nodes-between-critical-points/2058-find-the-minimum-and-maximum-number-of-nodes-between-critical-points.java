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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode next=head.next.next;
        ListNode current=head.next;
        ListNode prev=head;
        List<Integer>list=new ArrayList<>();
        int ind=1;
        while(next!=null){
            if((prev.val<current.val&&next.val<current.val)||(prev.val>current.val&&next.val>current.val)){
                list.add(ind);
            }
            ind++;
            prev=current;
            current=next;
            next=next.next;
        }
        if(list.size()<2)return new int[]{-1,-1};
        int min=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            min=Math.min(min,list.get(i)-list.get(i-1));
        }
        int max=list.get(list.size()-1)-list.get(0);
            return new int[]{min,max};
    }
}