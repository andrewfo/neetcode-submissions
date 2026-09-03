/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next  != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //midpoint is slow
        ListNode h = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(h != null){
            ListNode curr = h.next;
            h.next = prev;
            prev = h;
            h = curr;
        }
        //prev is the head of the reversed half of list
        ListNode curr = head;
        h = prev;
        while(h != null){
            ListNode temp = curr.next;
            curr.next = h;
            ListNode temp2 = h.next;
            h.next = temp;
            curr = temp;
            h = temp2;
        }

    }
}
