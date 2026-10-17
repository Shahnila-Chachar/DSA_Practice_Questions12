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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        if(head.val==val){
            head=head.next;
            return head;
        }
        ListNode current = head;
        while(current != null && current.next!=null){
            if(current.next.val==val){
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;
    }
}