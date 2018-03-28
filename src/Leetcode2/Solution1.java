package Leetcode2;

/**
 * Created by DELL on 2018/3/22.
 * 给你两个非空链表，表示两个非负整数。
 * 数字以相反的顺序存储，每个节点都包含一个数字。添加这两个数字并将其作为链接列表返回。
 *
 * 输入：（2→4→3）+（5→6→4）
 * 输出： 7→0→8
 * 说明： 342 + 465 = 807。
 */
public class Solution1 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1,l2,true);
    }
    public ListNode add(ListNode l1, ListNode l2,boolean flag) {
        boolean a = l1 == null;
        boolean b = l2 == null;
        if (a && b && flag) {
            return null;
        }
        int val = (a?0:l1.val) + (b?0:l2.val) +(flag?0:1);
        int v = val%10;
        boolean f = (v == val);
        ListNode answer = new ListNode(v);
        answer.next = add(a?null:l1.next,b?null:l2.next,f);
        return answer;
    }
}