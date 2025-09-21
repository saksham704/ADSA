// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Linkedlistcycle {
    
    // Method to detect cycle
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        Linkedlistcycle solution = new Linkedlistcycle();
        
        // Create nodes
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        
        // Connect nodes
        head.next = node2;
        node2.next = node0;
        node0.next = node4;
        node4.next = node2; // creates a cycle (pointing back to node2)
        
        // Test hasCycle
        boolean result = solution.hasCycle(head);
        System.out.println("Does linked list have a cycle? " + result);
    }
} // <- cl

