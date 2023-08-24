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
        ListNode pre = head;
        ListNode save = head;
        int max = 0;
        while(save != null && save.next!= null){
            pre = pre.next;
            save = save.next.next;
        }
        ListNode n , ok = null;
        while(pre != null){
            n = pre.next;
            pre.next = ok;
            ok = pre;
            pre = n;
        }

        while(ok != null){
            max = Math.max(max , head.val + ok.val);
            ok = ok.next;
            head = head.next;
        }

        return max;
    }
}
