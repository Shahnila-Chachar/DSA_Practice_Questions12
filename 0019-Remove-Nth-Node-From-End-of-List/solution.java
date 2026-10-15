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
        ListNode fast = head;
        for(int i=0; i<n; i++){
            fast = fast.next;
        }
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow = slow.next;
        return slow;
    }
}